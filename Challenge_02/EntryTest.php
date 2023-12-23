<?php

include_once './vendor/autoload.php';

use PHPUnit\Framework\TestCase;

final class EntryTest extends TestCase
{
  public function testOutputShouldBe4(): void
  {
    $token = '##*&';

    $compiler = new TokenCompiler($token);

    $output = $compiler->compile();

    $this->assertSame('4', $output);
  }

  public function testOutputShouldBe0243(): void
  {
    $token = '&##&*&@&';

    $compiler = new TokenCompiler($token);

    $output = $compiler->compile();

    $this->assertSame('0243', $output);
  }
}
