const myPromise = new Promise((resolve,reject) => {
  setTimeout(() => {
    const sucesso = true;
    if(sucesso) {
      resolve("A operação foi feita com sucesso!");
    }else {
      reject("Ocorreu um erro!");
    }
  },2000);
});

myPromise.then((resultado) => {console.log(resultado)});
myPromise.catch((erro) => {console.log(erro)});