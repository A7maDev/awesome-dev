<?php

add_action('wp_logout','wppbc_redirect_logout');
function wppbc_redirect_logout(){
    wp_redirect( home_url() );
    exit();
}
