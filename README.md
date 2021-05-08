# Общие сведения
Приложение должно скачивать HTML-страницу посредством HTTP-запроса, сохранять загруженный файл на жесткий диск компьютера, подсчитывать количество уникальных слов на странице и выводить статистику по словам в консоль.
# Технологии
* Java
# Задание:
В качестве входных данных в приложение принимает строку с адресом web-страницы. Пример входной строки: https://www.simbirsoft.com/
<br>Приложение разбивает текст страницы на отдельные слова с помощью списка разделителей: {' ', ',', '.', '!', '?','"', ';', ':', '[', ']', '(', ')', '\n', '\r', '\t'}
<br>В качестве результата работы пользователь должен получить статистику по количеству уникальных слов в тексте. Пример:
* РАЗРАБОТКА - 1
* ПРОГРАММНОГО - 2
* ОБЕСПЕЧЕНИЯ - 4

Пример входной строки:
https://www.simbirsoft.com/

Пример вывода статистики вхождений слов:
* медицинской - 2
* upload - 54
* FORMAT - 2
* найти - 1

# Руководство
<br>Программа считывает первый входной аргумент если он есть
<br>Если его нет, то просит ввести строку вида https://www.simbirsoft.com/
<br>Программа проверяет корректность введенной строки, если строка не соответствует паттерну URL, то выведется ошибка
<br>Программа выводит в консоль статистику по словам, найденным на введенной странице
<br>После вывода статистики, цикл повторяется с введения URL
