let result = document.getElementById('result');

function appendValue(value) {
    result.value += value;
}

function clearResult() {
    result.value = '';
}

function calculateResult() {
    let expression = result.value;
    let answer = eval(expression);
    result.value = answer;
}
