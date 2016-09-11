# XAMPP - Increase PHP File Size

- Open PHP.ini from XAMPP Control Panel

![XAMPP Control Panel](http://i.imgur.com/ajUh0d6.png)

- Change the following to

```
upload_max_filesize = 100M 
memory_limit = 128M
post_max_size = 100M
```

- Save and restart Apache from the control panel


## Sources
- [XAMPP I cannot upload big dump files (memory, HTTP or timeout problems)](http://localhost/phpmyadmin/doc/html/faq.html#faq1-16)
