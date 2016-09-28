# Laravel

## Migration

- Create new table
```
Schema::create('annotations', function (Blueprint $table) {
  // add your code
});
```

- Change table columns
```
Schema::table('table_name', function (Blueprint $table) {
   // add your code
});
```

- Drop Table
```
Schema::dropIfExists('annotations');
```

- Rename table
```
Schema::rename("from_name", "to_name");
```

- Delete column
```
$table->dropColumn('lowest_grade');
```

- Drop foreign key
```
$table->dropForeign('annotations_file_id_foreign');
```

- Add foreign key
```
$table->integer('file_id')->unsigned()->nullable();
$table->foreign('file_id')->references('id')->on('files')->onDelete('cascade');
```

- Change column
```
$table->string('name')->nullable()->change();
```
