<?php

// functions.php
function shortcode_hello( $atts ){
    return "Hello, John";
}
add_shortcode( 'hello', 'shortcode_hello' );
