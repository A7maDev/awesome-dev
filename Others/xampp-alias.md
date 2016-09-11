# XAMPP Alias

1. Open Apache config (httpd.conf)
2. Copy the following in the section below ServerName localhost:80

```
<Directory "C:\Users\user\Desktop\projec_folder">
    Options Indexes FollowSymLinks MultiViews
    AllowOverride All
    Require all granted
</Directory>

Alias /alias_name "C:\Users\user\Desktop\projec_folder"
```
