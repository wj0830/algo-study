/* 이동 평균 구하기 */
/* node.js */

// 실수 배열 A가 주어질 때, 각 위치에서의 M-이동 평균 값을 구한다.
function movingAverage1(A, M) {
	var ret = new Array();
	var N = A.length;
	for (var i = M-1; i < N; ++i) {
		// A[i]까지의 이동 평균 값을 구하자.
		var partialSum = 0;
		for (var j = 0; j < M; ++j) {
			partialSum += A[i-j];
		}
		ret.push(partialSum / M);
	}
	return ret;
}

var A = [1,2,4,8,16,32,64,128];
var M = 2;

var ret = movingAverage1(A, M);
console.dir(ret);
