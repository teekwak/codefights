const rewire = require('rewire');
const app = rewire('../beautifulJavascript.js');
secretArchivesLock = app.__get__('secretArchivesLock');

describe('Test Cases', function () {
	it('Passes Test 1', () => {
		const lock = ["....", "AB..", ".C..", "...."];
		const actions = "RDL";
		const answer = ["....", "....", "B...", "AC.."];

		expect(secretArchivesLock(lock, actions)).toEqual(answer);
	});

	it('Passes Test 2', () => {
		const lock = ["A.B", "...", "C.D"];
		const actions = "DR";
		const answer = ["...", ".AB", ".CD"];

		expect(secretArchivesLock(lock, actions)).toEqual(answer);
	});

	it('Passes Test 3', () => {
		const lock = ["AB", "CD"];
		const actions = "RURL"
		const answer = ["AB", "CD"];

		expect(secretArchivesLock(lock, actions)).toEqual(answer);
	});

	it('Passes Test 4', () => {
		const lock = ["A.", "CD"];
		const actions = "RRRRRRRR";
		const answer = [".A", "CD"];

		expect(secretArchivesLock(lock, actions)).toEqual(answer);
	});

	it('Passes Test 5', () => {
		const lock = ["AB", ".."];
		const actions = "DR";
		const answer = ["..", "AB"];

		expect(secretArchivesLock(lock, actions)).toEqual(answer);
	});

	it('Passes Test 6', () => {
		const lock = ["U....", ".....", ".....", "....."];
		const actions = "RDL";
		const answer = [".....", ".....", ".....", "U...."];

		expect(secretArchivesLock(lock, actions)).toEqual(answer);
	});

	it('Passes Test 7', () => {
		const lock = [".....", "..A..", ".C...", "...D."];
		const actions = "UDR";
		const answer = [".....", ".....", ".....", "..CAD"]

		expect(secretArchivesLock(lock, actions)).toEqual(answer);
	});

	it('Passes Test 8', () => {
		const lock = ["...PD.O..P", ".MF.......", "Q.....I...", "....JNJ...",
 								  ".Y..O.O.J.", "V..U......", "..J..H....", "....T.J...",
 								  "W.....A.B.", ".P....O.K."];
		const actions = "D";
		const answer = ["..........", "..........", "..........", "......O...",
										"......I...", "......J...", "....D.O...", "QM..J.J.J.",
 										"VYFPONA.B.", "WPJUTHO.KP"];

		expect(secretArchivesLock(lock, actions)).toEqual(answer);
	});

	it('Passes Test 9', () => {
		const lock = ["...PD.O..P", ".MF.......", "Q.....I...", "....JNJ...",
 									".Y..O.O.J.", "V..U......", "..J..H....", "....T.J...",
 									"W.....A.B.", ".P....O.K."];
		const actions = "L";
		const answer = ["PDOP......", "MF........", "QI........", "JNJ.......",
 										"YOOJ......", "VU........", "JH........", "TJ........",
 										"WAB.......", "POK......."];

		expect(secretArchivesLock(lock, actions)).toEqual(answer);
	});

	it('Passes Test 10', () => {
		const lock = ["...PD.O..P", ".MF.......", "Q.....I...", "....JNJ...",
 								 	".Y..O.O.J.", "V..U......", "..J..H....", "....T.J...",
 									"W.....A.B.", ".P....O.K."];
		const actions = "LD";
		const answer = ["PD........", "MF........", "QI........", "JN........",
 										"YO........", "VUO.......", "JHJ.......", "TJO.......",
 										"WABP......", "POKJ......"];

		expect(secretArchivesLock(lock, actions)).toEqual(answer);
	});

	it('Passes Test 11', () => {
		const lock = ["V...Y..E.PRFI..", ".ZO...ZU.R.Z...", ".....R.......U.",
									"..N.CE...S..RP.", "...J........T..", ".......H..I....",
									".N.JE.......J.F", "...............", "A.K..G.........",
 									"...PW.....W.G..", "UO..BJT.G.I....", ".R.....J.......",
 									"...............", "..M.GCD.....S..", ".X.S..........."]
		const actions = "LULLR";
		const answer = ["........VYEPRFI", "........ZOZURZI", ".........RUESRP",
 										".........NCEJFG", "..........JTGGT", "..........HIWJS",
 										"...........NJBD", "............AKC", ".............PW",
 										".............UO", ".............RJ", ".............MG",
 										".............XS", "...............", "..............."]

		expect(secretArchivesLock(lock, actions)).toEqual(answer);
	});
});
