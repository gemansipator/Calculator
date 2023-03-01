let a = ''; //first number
let b = ''; // second number
let sign = ''; // знак операции
let finish = false;

const digit = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ','];
const action = ['-', '+', '*','/'];

// экран
const out = document.querySelector('.calc-screen p');  // пояснение внизу №1.

function clearAll () {
    a = ''; // first number and result
    b = ''; // second number
    sign = ''; // знак
    finish = false;
    out.textContent = 0;
}
document.querySelector('.AC').onclick = clearAll; // в документе находим селектор AC
//подключаем обработчик нажатий onclick и функцию clearAll которая будет срабатывать при нажатии

document.querySelector('.buttons').onclick = (event) => {
    // нажата кнопка
    if (!event.target.classList.contains('btn')) return;
    // нажата кнопка clearAll AC
    if (event.target.classList.contains('AC')) return;

    out.textContent = '';
    // получаю нажатую кнопку
    const key = event.target.textContent;

    // если нажата клавиша 0-9 или ,
    if (digit.includes(key)) {
        if (b === '' && sign === '') {
            a += key;

            out.textContent = a;
        } else if (a !== '' && b !== '' && finish) {
            b = key;
            finish = false;
            out.textContent = b;

        } else {
            b += key;
            out.textContent = b;
        }
        console.table(a, b, sign);
        return;
    }

    //если нажата клавиша + - / *
    if (action.includes(key)) {
        sign = key;
        out.textContent = sign;
        console.table(a, b, sign);
        return;
    }

    // нажата кнопка =
    if (key === '=') {
        if (b === '') b = a;
        switch (sign) {
            case "+":
                a = (+a) + (+b);
                break;
            case "-":
                a = a - b;
                break;
            case "*":
                a = a * b;
                break;
            case "/":
                if (b === '0') {
                    out.textContent = 'Ошибка';
                    a = '';
                    b = '';
                    sign = '';
                    return;
                }
                a = a / b;
                break;
        }
        finish = true;
        out.textContent = a;
        console.table(a, b, sign);


    }


}



/*
Пояснение №1.
Находим элемент с помощью querySelector
Мы переключили тему на странице, вручную поменяв классы в разметке. Пришло время сделать это с помощью JavaScript.

Программа на JavaScript — это последовательность инструкций, которые указывают браузеру выполнить какие-то действия.
Мы собираемся менять классы у элемента page, и в первую очередь должны получить доступ к нему из скрипта. Как это
сделать?
Представьте, что JavaScript — это очень умная собака. Она знает множество команд, в том числе «найди и принеси элемент»
 — querySelector:

document.querySelector('селектор');
Обратите внимание, эта инструкция состоит из двух частей. Первая часть — это элемент, внутри которого будет искать
 JavaScript. Словом document обозначается веб-страница, к которой подключили скрипт. Неважно, как называется файл
  на самом деле, в JavaScript это всегда «документ». Он является элементом-родителем для любого другого элемента
   на странице.

Вторая часть инструкции — это то, что нужно сделать. Её называют методом. Метод querySelector ищет по селектору, который
 указан в скобках. Не знаете, что такое селектор? Тогда вам стоит заглянуть в «Основы CSS», там всему научат.

Чтобы сказать JavaScript, что инструкция закончена, нужно поставить точку с запятой или перейти на новую строку. Новая
строка правильно работает в большинстве случаев, а точка с запятой — всегда. Поэтому лучше ставить точку с запятой в
конце каждой инструкции.

Итак, чтобы найти на странице элемент с классом page, мы должны написать:

document.querySelector('.calc-screen p');    (дописали p чтобы срабатывало внутри <p>0</p>
Подключим к странице файл, в котором будем писать наш код, и найдём нужный элемент
 */
