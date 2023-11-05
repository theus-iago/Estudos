/*IIFE functions*/
(function() {
  console.log("Esta é uma IIFE!");
})();

//--------------×----------------//

/*Callback functions*/
function somar(n1,n2,callback) {
  const resultado = n1 + n2;
  callback(resultado);
}
function soma(soma) {
  console.log("O resultado é:",soma);
}
somar(5,5,soma);

//--------------×----------------//

/*Arrow functions*/
const arrow = () => {
  console.log("arrow function!");
}
