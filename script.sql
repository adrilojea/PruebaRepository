CREATE SCHEMA `ibmtest` ;

CREATE TABLE `ibmtest`.`proveedor` (id_proveedor INT, fecha_alta DATE, id_cliente INT, nombre VARCHAR(255));

INSERT INTO `ibmtest`.`proveedor` (`id_proveedor`, `fecha_alta`, `id_cliente`, `nombre`) VALUES ('1', '2020/01/19', '5', 'CocaCola');
INSERT INTO `ibmtest`.`proveedor` (`id_proveedor`, `fecha_alta`, `id_cliente`, `nombre`) VALUES ('2', '2020/01/19', '5', 'Pepsi');
INSERT INTO `ibmtest`.`proveedor` (`id_proveedor`, `fecha_alta`, `id_cliente`, `nombre`) VALUES ('3', '2020/01/19', '6', 'Redbull');
