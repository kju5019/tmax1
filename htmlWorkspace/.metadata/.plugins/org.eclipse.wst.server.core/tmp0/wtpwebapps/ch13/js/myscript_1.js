/**
 * 1st 스크립트.
 */
 var heading = document.querySelector('#heading');				/* script 자체는 어디 있어도 상관 없다.********* */
heading.onclick = function() {									/* </body> 직전에 쓰면 좋음 */
	heading.style.color='red';
}