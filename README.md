# ejercicio_09

9.- La empresa informática “IPM Tech” necesita llevar un registro de todos sus empleados que se encuentran en la oficina central, para eso debe incluir las siguientes clases:
• Empleado
• Programador
• Principal (alojará el método main)

A) Empleado
Atributos: 
- nombre: tipo cadena (Debe ser nombre y apellido) 
- cedula: tipo cadena - edad : entero (Rango entre 18 y 45 años) 
- casado: boolean - salario: tipo numérico doble

Métodos: 
- Constructor con y sin parámetros de entrada 
- Método que permita mostrar la clasificación según la edad de acuerdo al siguiente algoritmo: Si edad es menor o igual a 21, Principiante Si edad es >=22 y <=35, Intermedio Si edad es >35, Senior.

- Imprimir los datos del empleado por pantalla (utilizar salto de línea \n para separar los atributos.

- Un método que permita aumentar el salario en un porcentaje que sería pasado como parámetro al método.

B) Programador (Especialización de Empleado). Clase que hereda de Empleado todos los atributos y métodos.

Atributos: 
- lineasDeCodigoPorHora : tipo entero 
- lenguajeDominante: tipo cadena

Metodos: 
- Constructor con y sin parámetos de entrada.

