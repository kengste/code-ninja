/**
 * N = |str1| && M = |str2|
 * Time: O(N lg N + M lg M)
 * Additional space: O(1) if able to modify original strings, O(N + M) otherwise
 * 
 * @param {string[]} str1 First string, passed in as a character array
 * @param {string[]} str2 Second string, passed in as a character array
 * @return {boolean} True if first and second strings are permutations
 */

 function solution(str1, str2) {
   if (str1.length === 0 || str1.length !== str2.length) return false;
   str1.sort().join();
   str2.sort().join();

   return str1 === str2;
 }