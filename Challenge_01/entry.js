/*
 * Challenge 01 - Codember by @midudev
 *
 * gato perro perro coche Gato peRRo sol -> gato2perro3coche1sol1
 * llaveS casa CASA casa llaves -> llaves2casa3
 * taza ta za taza -> taza2ta1za1
 * casas casa casasas -> casas1casa1casasas1
 */

const fs = require('fs');
const decrypt_message = require('./utils');

const MESSAGE_FILE_PATH = '../data/message_01.txt'

try {
  const data = fs.readFileSync(MESSAGE_FILE_PATH, 'utf8');
  const message_decrypted = decrypt_message(data);

  console.log(message_decrypted)
} catch (_) {
  console.error(`The ${MESSAGE_FILE_PATH} file could not be read, please download it and place it in the ../data/ directory to continue.`);
  console.info('Download file: https://codember.dev/data/message_01.txt')
}
