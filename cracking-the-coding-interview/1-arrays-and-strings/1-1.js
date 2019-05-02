/**
 * Time: O(N log N)
 * Additional space: O(1)
 * @param {string[]} str String to check, passed in as a character array
 * @return {boolean} True if unique characters
 */

function solution(str) {
  str.sort();
  for (let i = 1; i < str.length; i++) {
    if (str[i] === str[i - 1]) {
      return false;
    }
  }
  return true;
}