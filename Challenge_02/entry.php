<?php

include_once './TokenCompiler.php';

$message = file_get_contents('../data/message_02.txt', FILE_USE_INCLUDE_PATH);

$compiler = new TokenCompiler($message);

$output = $compiler->compile();

echo "$output\n";
