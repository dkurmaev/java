<ol>
<li> <code>V getOrDefault(Object k, V defaultValue)</code>: возвращает значение объекта, ключ которого равен k. Если такого элемента не окажется, то возвращается значение defaultVlue.
</li> 
<li> <code>V putIfAbsent(K k, V v)</code>: помещает в коллекцию новый объект с ключом k и значением v, если в коллекции еще нет элемента с подобным ключом.
</li>
<li> <code>V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)</code> принимает два параметра. Первый параметр — это ключ , а второй параметр — это функция отображения. Важно знать, что функция сопоставления вызывается только в том случае, если сопоставление отсутствует.
</li>
<li> <code>V computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)</code>
Если значение для указанного ключа присутствует и не null, метод пытается вычислить новое отображение с учетом ключа и его текущего значения.
</li>
<li> <code>V merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)</code>
Метод merge в интерфейсе Map в Java позволяет объединять значения по ключам с помощью заданной функцииhttps. Если указанный ключ еще не связан со значением или значение равно null, он связывает ключ с данным значением. В противном случае он заменяет значение результатом заданной функции переопределения. Если результат функции переопределения равен null, он удаляет результат.
</li>
<li> Объекты класса Optional<T> используются как контейнер для ссылок, которые могут принимать значение null. Положить объект в Optional можно при помощи статического метода Optional.ofNullable(...). Метод optional.get() возвращает содержимое optional, но только если оно не null. Метод optional.isPresent() возвращает true, false в зависимости от того есть что-то внутри optional или там null. Метод optional.ifPresent(Consumer), выполняет переданную функцию, но только если optional не содержит null. Метод optional.orElse(default) возвращает содержимое optional если оно не null, или default в противном случае. Метод optional.orElseGet(Supplier) возвращает содержимое optional если оно не null, или результат работы функции в противном случае. Метод optional.orElseThrow(Supplier) возвращает содержимое optional если оно не null, или бросает исключение созданное функцией в противном случае.
</li>
</ol>