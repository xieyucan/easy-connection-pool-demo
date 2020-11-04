CREATE TABLE `db` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `db_name` varchar(255) DEFAULT NULL,
  `driver_class_name` varchar(255) DEFAULT NULL,
  `jdbc_url` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `pool_name` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `group_name` varchar(255) DEFAULT '',
  `balance_type` varchar(50) DEFAULT '',
  `minimum_idle` int(11) DEFAULT '1',
  `maximum_pool_size` int(11) DEFAULT '1',
  `connection_test_query` varchar(255) DEFAULT 'SELECT 1',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
