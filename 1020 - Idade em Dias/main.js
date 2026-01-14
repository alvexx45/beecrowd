const input = require('fs').readFileSync('/dev/stdin', 'utf8');
let tot = parseInt(input);
let years = Math.floor(tot / 365);
let months = Math.floor(tot % 365 / 30);
let days = tot % 365 % 30;

console.log(years + ' ano(s)');
console.log(months + ' mes(es)');
console.log(days + ' dia(s)');