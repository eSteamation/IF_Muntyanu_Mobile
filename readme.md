# Автотест мобильного приложения при помощи Appium

Небольшая демонстрация возможностей Appium в рамках дополительного задания академии iFellow.

## Технологии

**Основа проекта:** Intellij IDEA, Maven, Java 17, JUnit5;

**Библиотеки и плагины:** JUnit5, Selenium, Selenide, Aoenbits, Surefire, UiAutomator2Options;

**Сервер:** Appium 2.*, хостится локально;

**Использованные инструменты:** Appium Inspector, Android Studio (Virtual Device Manager);

## Тестовая среда

**Эмулятор:** Android Studio

**Производитель:** Google

**Эмулируемая модель:** Pixel 2

**API level:** 27

**Версия платформы:** Android 8.1 ("Oreo") | x86

## Назначение теста

Тест, в первую очередь, призван быть ознакомление с работой Appium, Appium Inspector и мобильным тестированием.

1. Инициализируется эмулятор.
2. Открывается приложение Wikipedia.
3. Пропускается приветственное меню.
4. Вводим в поиск заданные данные.
5. Проверяем, что первый предложенный результат совпадает с нашими запросами. 

