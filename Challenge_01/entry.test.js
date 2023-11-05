const decrypt_message = require('./utils')

test('gato perro perro coche Gato peRRo sol must be gato2perro3coche1sol1', () => {
  expect(decrypt_message('gato perro perro coche Gato peRRo sol')).toBe('gato2perro3coche1sol1')
})

test('llaveS casa CASA casa llaves must be llaves2casa3', () => {
  expect(decrypt_message('llaveS casa CASA casa llaves')).toBe('llaves2casa3')
})

test('taza ta za taza must be taza2ta1za1', () => {
  expect(decrypt_message('taza ta za taza')).toBe('taza2ta1za1')
})

test('casas casa casasas must be casas1casa1casasas1', () => {
  expect(decrypt_message('casas casa casasas')).toBe('casas1casa1casasas1')
})
