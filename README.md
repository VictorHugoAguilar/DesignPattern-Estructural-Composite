# Patrón de Diseño - Creacional - Builder

Builder es un patrón de diseño creacional que nos permite construir objetos complejos paso a paso. El patrón nos permite producir distintos tipos y representaciones de un objeto empleando el mismo código de construcción.

El patrón Builder sugiere que saques el código de construcción del objeto de su propia clase y lo coloques dentro de objetos independientes llamados constructores.

El patrón organiza la construcción de objetos en una serie de pasos (construirMotor, construirPuerta, etc.). Para crear un objeto, se ejecuta una serie de estos pasos en un objeto constructor. Lo importante es que no necesitas invocar todos los pasos. Puedes invocar sólo aquellos que sean necesarios para producir una configuración particular de un objeto.

![UML - Patron Builder](https://github.com/VictorHugoAguilar/DesignPattern-Creational-Builder/blob/master/img/builder-diagram.png?raw=true)

![Diagrama de Secuencia](https://github.com/VictorHugoAguilar/DesignPattern-Creational-Builder/blob/master/img/builder-sequence.png?raw=true)

