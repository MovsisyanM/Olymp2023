DB Tables:  
```
address (
    id INT NOT NULL AUTO_INCREMENT,
    street_name VARCHAR(255) NOT NULL,
    building_no VARCHAR(10) NOT NULL,
    city_name VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
);

route (
id INT NOT NULL AUTO_INCREMENT,
route_id INT NOT NULL,
order_number INT NOT NULL,
workload_index INT,
usage_index INT,
start_date INT(11),
end_date INT(11),
address_id INT NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (address_id) REFERENCES address(id)
);
```

First page table:  
| | Route ID | Start address | End address | Workload index | Usage index | Start date | End date |  
| -- | -- | -- | -- | -- | -- | -- | -- |  
| 1 | 126582387 | New York City... | This status inform | 12 | 23 | 13 May 2022 - 11:20 | 13 May 2022 - 11:23 |  


Second page content:  
1. Average of workload index **card**
2. Average of usage index **card**
3. Busy hours **card** interval of time  
4. Loaded route total monthly **barchart**
5. Used route total **barchart**