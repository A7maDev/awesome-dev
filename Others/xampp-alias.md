# XAMPP Alias

- Open Apache config (httpd.conf) from XAMPP Control Panel

![XAMPP Control Panel](http://i.imgur.com/FXHWLg7.png)

- Copy the following in the section below ServerName localhost:80

```
<Directory "C:\Users\user\Desktop\projec_folder">
    Options Indexes FollowSymLinks MultiViews
    AllowOverride All
    Require all granted
</Directory>

Alias /alias_name "C:\Users\user\Desktop\projec_folder"
```

- Restart Apache from XAMPP Control Panel
