# Геометрические Фигуры - Приложение

Это Java-приложение отображает выбранные пользователем геометрические фигуры. Пользователь вводит числовое значение, которое трактуется как количество сторон фигуры. В зависимости от введенного значения программа рисует соответствующую фигуру на панели рисунка.

## Содержание

- [Описание](#описание)
- [Архитектура](#архитектура)
- [Требования](#требования)
- [Установка](#установка)

## Описание

Программа позволяет пользователю вводить число сторон фигуры, после чего автоматически отрисовывается соответствующая геометрическая форма:
- **1** – круг
- **2** – овал
- **3** – треугольник
- **4** – квадрат

## Архитектура  

Приложение использует объектно-ориентированный подход для рисования геометрических фигур. Основные компоненты архитектуры включают в себя:

#### Абстрактный класс Shapes:

Это супер класс, который определяет общую структуру для всех геометрических фигур. Он содержит абстрактный метод draw(), который должен быть реализован в подклассах. Этот метод отвечает за логику отрисовки фигуры.

#### Подклассы фигур:

Класс Oval: Наследует от Shapes и реализует метод draw(), контролируя процесс рисования овала.
![Описание изображения](images/oval.jpg)

Класс Rectangle: Наследует от Shapes и отвечает за логику отрисовки квадрата, также реализуя метод draw().
![Описание изображения](images/restagle.jpg)

Класс Triangle: Наследует от Shapes и реализует метод draw(), который управляет рисованием треугольника.
![Описание изображения](images/triangle.jpg)

Класс Circle: Наследует от Shapes, реализует метод draw() и контролирует процесс рисования круга.
![Описание изображения](images/circle.jpg)
### Реализация Фабричного метода:
В приложении был внедрен Фабричный метод для создания объектов фигур. Вместо того чтобы создавать экземпляры фигур напрямую, приложение использует специальный класс-фабрику, который выбирает и создает соответствующую фигуру в зависимости от ввода пользователя.

## Требования

- Java 11 или выше
- JavaFX для GUI

## Установка

1. Клонируйте репозиторий:
   ```bash
   git clone https://github.com/AnnaRzhavikina/projectfigura.git

