# Proyecto-Boxworld-Sokoban-Compiladores
    El sistema está desarrollado bajo kotlin en para parte de android y en el socket está por java. La aplicación móvil se conecta con el socket mediante un puerto indicado previamente a la compilación del jar también antes de la instalación de la aplicación kotlin.

<img src='/recursos-git/01_1366x768_scrot.png'>

## Socket o servidor

El servidor al arrancar siempre estará en espera de las llamadas, y recibirá un json que indicara la petición

### tipos de peticiones


* Esta petición retorna un xml dando los nombres de los mapas registrados en el servidor.

    ```bash
	{
		"worlds": "all"
	}
    ```

	returnarcion 
	```bash
	<?xml version="1.0" encoding="UTF-8"?>
		<worlds>
			<world>tatoine</world>
			<world>alderaan</world>
			<world>yavin_iv</world>
		</worlds>
    ```
* Con esta petición se indicará un mapa existente en el servidor para ser mapeado en el juego siguiente.

    ```bash
	{
		"world": "tatoine"
	}
    ```

	returnarcion 
	```bash
	<?xml version="1.0" encoding="UTF-8"?>
		<worlds>
			<world>
			<name>tatoine</name>
			<rows>5</rows>
			<cols>4</cols>
			<config>
				<box_color>#ffff00</box_color>
				<box_on_target_color>#fe0002</box_on_target_color>
				<target_color>#d6fe0a</target_color>
				<brick_color>#bdbebf</brick_color>
				<hall_color>#0001ff</hall_color>
				<undefined_color>#303030</undefined_color>
				<player_color>#ff00f7</player_color>
			</config>
			<board>
				<posX>0</posX>
				<posY>0</posY>
				<type>BRICK</type>
			</board>
			<board>
				<posX>0</posX>
				<posY>1</posY>
				<type>BRICK</type>
			</board>
			<board>
				<posX>0</posX>
				<posY>2</posY>
				<type>BRICK</type>
            </board>
			<board>
				<posX>0</posX>
				<posY>3</posY>
				<type>BRICK</type>
			</board>
			<board>
				<posX>0</posX>
				<posY>4</posY>
				<type>BRICK</type>
			</board>
			<board>
				<posX>1</posX>
				<posY>0</posY>
				<type>BRICK</type>
			</board>
			<board>
				<posX>1</posX>
				<posY>1</posY>
				<type>HALL</type>
			</board>
			<board>
				<posX>1</posX>
				<posY>2</posY>
				<type>HALL</type>
			</board>
			<board>
				<posX>1</posX>
				<posY>3</posY>
				<type>HALL</type>
			</board>
			<board>
				<posX>1</posX>
				<posY>4</posY>
				<type>BRICK</type>
			</board>
			<board>
				<posX>2</posX>
				<posY>0</posY>
				<type>BRICK</type>
			</board>
			<board>
				<posX>2</posX>
				<posY>1</posY>
				<type>HALL</type>
			</board>
			<board>
				<posX>2</posX>
				<posY>2</posY>
				<type>HALL</type>
			</board>
			<board>
				<posX>2</posX>
				<posY>3</posY>
				<type>HALL</type>
			</board>
			<board>
				<posX>2</posX>
				<posY>4</posY>
				<type>BRICK</type>
			</board>
			<board>
				<posX>3</posX>
				<posY>0</posY>
				<type>BRICK</type>
			</board>
			<board>
				<posX>3</posX>
				<posY>1</posY>
				<type>BRICK</type>
			</board>
			<board>
				<posX>3</posX>
				<posY>2</posY>
				<type>BRICK</type>
			</board>
				<board>
				<posX>3</posX>
				<posY>4</posY>
				<type>BRICK</type>
			</board>
			<board>
           	 	<posX>3</posX>
				<posY>5</posY>
				<type>BRICK</type>
			</board>
			<boxes>
				<posX>2</posX>
				<posY>1</posY>
			</boxes>
			<boxes>
				<posX>2</posX>
				<posY>2</posY>
			</boxes>
			<targets>
				<posX>3</posX>
				<posY>1</posY>
			</targets>
			<targets>
				<posX>3</posX>
				<posY>2</posY>
			</targets>
			<player>
				<posX>1</posX>
				<posY>1</posY>
			</player>
		</world>
	</worlds>
    ```
### Ejecucion del socket

## Aplicacion mobil Android (kotlin)

	La parte de android esta se compila para el uso de un app y se instala de forma de aplicación de terceros.

### Ejecucion del socket