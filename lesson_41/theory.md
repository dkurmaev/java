# Exceptions, try catch

Exception - исключение, особая ситуация (перевод с английского)

## Major reasons why an exception Occurs
* **Invalid user input - неправильный ввод пользователя (80-90% случаев)**
* Device failure - сломалось устройство, выключили питание и т.д.
* Loss of network connection - потеряли Интернет, Ethernet и т.д.
* Physical limitations (out of disk memory) - нехватка памяти ОЗУ, жестких дисков
* Opening an unavailable file - открытие недоступного файла
* * **Code errors - ошибки кода программистов**

### Differences between Error and Exception that is as follows:
* **Error:** An Error indicates a **serious problem** that a reasonable application
  should **not try to catch**.
* **Exception:** Exception indicates **conditions** that a reasonable application
  **might try to catch**.

Кострукция **try ... catch** используется в тот момент, когда программа завершает работу
некорректно, Code выхода из программы отличен от 0.

### Синтаксис
`try { // попытаться
//  Block of code to try

}
catch(Exception e) { // схватить
//  Block of code to handle errors
}`

#### Пояснения
The **try** statement allows you to define a block of code
to be tested for errors while it is being executed.

The **catch** statement allows you to define a block of code
to be executed, if an error occurs in the try block.
The **try and catch keywords come in pairs**:

Многие исключения и ошибки пользователя можно обрабатывать самому с помощью if , НО ЗАЧЕМ?
Разарботчики Java предоставляют стандартный инструментарий для этого -
это класс Throwable (потомок класса Object) и его методы.

Примеры:
1. Деление на 0;
2. Выход за пределы массива;
3. Проверка ввода пользователя на корректность.

Хорошая статья с примерами:
https://www.geeksforgeeks.org/flow-control-in-try-catch-finally-in-java/

Алгоритм применения try ... catch
1. Ели программа падает (код окончания не равен 0), работа с пользователем прекращается
2. то смотрим на дигностику - то, что печатается в момент падения программы, там есть указания на номера строк
   в коде, в которых происходят ошибки
3. На эти строки надо "одеть" конструкцию try ... catch


# Complexity (вычислительная сложность)

Позволяет оценить эффективность алгоритмических решений. 
Простым языком можно сказать, что вычислительная сложность говорит, пропорционально какой математической функции 
растет колличество действий при обработки множества элементов, если увеличивать колличество элементов этого множества.

Для описания вычислительной сложности используется т. н. "Big O notation". 
Например, запись O(n), говорит о линейной сложности алгоритма. 
O(log(n)), характеризует логарифмическую сложность.

Полезная статья:
https://devopedia.org/algorithmic-complexity 

# ArrayList - что это и зачем?

## Концепция массива array:
для работы с большим количеством данных были реализованы МАССИВЫ:
Тип[] имя_массива = new ТИП[размер];
Массивы хранят данные ОДНОГО ТИПА (int, Srting, double, Тип другой класс...).

В массиве данные можно сохранить и затем ими управлять/манипулировать:
**C - создать, R - прочитать, E|U - отредактировать или обновить, D - удалить = CRED.**
НО с массивами "трудно" работать. В массивах "затратны" операции
поиска, добавления и сдвига, сортировки и т.д. Массив имеет неизменную длину (размер)!

### Концепция коллекций Collection (Collections Framework):
**Коллекция (Collection)** в Java — это структура, которая обеспечивает
архитектуру для хранения и управления группой **Объектов (Objects)**.

**Коллекции** позволяют хранить группы Объектов, это абстракция более общего уровня,
чем массивы. Хранить и управлять коллекциями в конечном счёте удобнее, выгоднее, чем массивами.

Для управления данными в коллекциях используют **интерфейсы** - в которых определены способы управления/манипулирования
объектами в коллекциях. В целом интерфейсы обеспечивают примерно одно и то же - **CRED** объектов
в коллекциях, но их реализация бывает специфична из-за различий видов и типов объектов в коллекциях.

Кто-то в группе архитекторов Java очень хорошо подумал и выявил общее свойство
для хранимых данных - **ПЕРЕЧЕСЛИМОСТЬ(ITERABLE)**.

Интерфейс **Iterable** - "родитель" трех видов интерфейсов:
- List (Список)
- Queue (Очередь)
- Set (Набор),
которые позволяют работать с коллекциями.

Наша с вами задача на данном этапе начать работать с классом **ArrayList** , который является реализацией 
на базе интерфейса List:
* Список - это коллекция, в которой все элементы имеют порядковый номер.
  Например, если элемент положили третьим, то его можно и получить под этим номером.

Класс **ArrayList** позволяет нам создавать объекты такого класса и ими пользоваться.

### Синтаксис создания ArrayList:
import java.util.ArrayList;

ArrayList<Тип> имяСписка = new ArrayList<Тип>();

**примеры:**
ArrayList<int> myArrayList = new ArrayList<int>(); // список целых чисел
ArrayList<String> myNamesList = new ArrayList<String>(); // список строк

### Действия с ArrayList:
1. Создать список
2. Вывести на печать
3. Узнать длину списка
4. Узнать индекс объекта в списке
5. Удалить объект из списка
6. Проверить наличие объекта в списке
7. Добавить объект в список, если его в нем нет
8. Вывод списка в цикле
________________________________________
9. Сортировка списка
10. Сортировка в оратном порядке (*)