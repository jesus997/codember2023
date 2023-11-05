const decrypt_message = (message) => {
  // transform message to lower case
  message = message.toLowerCase()
  // remove end of file
  message = message.replace('\n', '')
  // transform message to words array
  let tokens = message.split(' ')
  // count each token
  let uniqueTokens = {}
  tokens.forEach(token => {
    uniqueTokens[token] = token in uniqueTokens ? uniqueTokens[token] + 1 : 1
  });
  // generate response
  message = Object.keys(uniqueTokens).reduce((p, c) => `${p}${c}${uniqueTokens[c]}`, '')
  return message;
}

module.exports = decrypt_message;
