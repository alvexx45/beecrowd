let tot = read_int()
let years = tot / 365
let months = tot mod 365 / 30
let days = tot mod 365 mod 30;;

Printf.printf "%d ano(s)\n" years;
Printf.printf "%d mes(es)\n" months;
Printf.printf "%d dia(s)\n" days
