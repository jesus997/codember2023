<?php

class TokenCompiler {
  private string $originalToken;

  private array $tokens;

  private int $value = 0;

  public function __construct($token = '') {
    if ($token === '') throw new Exception("Token can't be empty.", 1);

    $this->originalToken = $token;

    $this->splitToken();
  }

  public function compile() {
    $output = '';

    foreach ($this->tokens as $token) {
      switch ($token) {
        case '#':
          $this->value++;
          break;
        case '@':
          $this->value--;
          break;
        case '*':
          $this->value *= $this->value;
          break;
        case '&':
          $output = "$output{$this->value}";
          break;
        default:
          # Ignore
          break;
      }
    }

    return $output;
  }

  private function splitToken() {
    $this->tokens = str_split($this->originalToken);

    return $this->tokens;
  }
}
