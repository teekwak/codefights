function moveCells(layout, direction) {
    const isHorizontalMovement = ['L', 'R'].includes(direction);
    const isDirectionUpOrLeft = ['U', 'L'].includes(direction);
    const maxSize = isHorizontalMovement ? layout[0].length : layout.length;
    const values = isHorizontalMovement ? layout : layout[0];

    values.forEach((_, index) => {
        const oldValues = isHorizontalMovement ? layout[index] : layout.map(row => row[index]);
        const newValues = oldValues.filter(value => value !== '.');

        while (newValues.length < maxSize) {
            isDirectionUpOrLeft ? newValues.push('.') : newValues.unshift('.');
        }

        isHorizontalMovement ? layout[index].splice(0, maxSize, ...newValues) :
            layout.forEach((row, rowIndex) => row[index] = newValues[rowIndex]);
    });
};

function secretArchivesLock(lock, actions) {
    const lockLayout = lock.map(row => row.split(''));
    actions.split('').forEach(action => moveCells(lockLayout, action));
    return lockLayout.map(row => row.join(''));
};
