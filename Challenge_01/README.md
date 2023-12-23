![Codember ver. 2023](../resources/codember-logo.png)
# Challenge_01 | Codember by [@midudev](https://twitter.com/midudev)

**Language:** JavaScript (NodeJS)

## El reto

Un espía está enviando mensajes encriptados.

Tu misión es crear un programa que nos ayude a buscar patrones...

Los mensajes son palabras separadas por espacios como este:
gato perro perro coche Gato peRRo sol

Necesitamos que el programa nos devuelva el número de veces que aparece cada palabra en el mensaje, independientemente de si está en mayúsculas o minúsculas.

El resultado será una cadena de texto con la palabra y el número de veces que aparece en el mensaje, con este formato:
gato2perro3coche1sol1

¡Las palabras son ordenadas por su primera aparición en el mensaje!

## Más ejemplos:

* llaveS casa CASA casa llaves -> llaves2casa3
* taza ta za taza -> taza2ta1za1
* casas casa casasas -> casas1casa1casas1

## Cómo resolverlo

1. Resuelve el mensaje que encontrarás en este archivo: https://codember.dev/data/message_01.txt
2. Envía tu solución con el comando "submit" en la terminal, por ejemplo así:
submit perro3gato3coche1sol1

## Como ejecutar la solución

Para ejecutar la solución al reto basta con ejecutar el comando `node entry.js` o `npm run challenge`.

### Pruebas unitarias

> :warning: Para correr las pruebas unitarias es necesario instalar la dependencia jest. Puedes hacerlo ejecutando `npm install` dentro de la carpeta Challenge_01.

Para ejecutar las pruebas unitarias, es necesario ejecutar el comando `npm test`.
