package vistacontrol;

import java.util.Scanner;

public class pruebas {
public static 	Scanner tec = new Scanner(System.in);
	
public static void espacios(int cantidad) {
	for (int i = 0; i < cantidad; i++) {
		System.out.println("\n");
		
	}

}
	
	public static void main(String[] args) {
		System.out.println("\033[36m                                                                                                      \r\n" + 
				"           .---.  ,---,                   ___                   ,---,.                        ___     \r\n" + 
				"          /. ./|,--.' |                 ,--.'|_               ,'  .' |                      ,--.'|_   \r\n" + 
				"      .--'.  ' ;|  |  :                 |  | :,'            ,---.'   |             __  ,-.  |  | :,'  \r\n" + 
				"     /__./ \\ : |:  :  :                 :  : ' :  .--.--.   |   |   .'           ,' ,'/ /|  :  : ' :  \r\n" + 
				" .--'.  '   \\' .:  |  |,--.  ,--.--.  .;__,'  /  /  /    '  :   :  :    ,--.--.  '  | |' |.;__,'  /   \r\n" + 
				"/___/ \\ |    ' '|  :  '   | /       \\ |  |   |  |  :  /`./  :   |  |-, /       \\ |  |   ,'|  |   |    \r\n" + 
				";   \\  \\;      :|  |   /' :.--.  .-. |:__,'| :  |  :  ;_    |   :  ;/|.--.  .-. |'  :  /  :__,'| :    \r\n" + 
				" \\   ;  `      |'  :  | | | \\__\\/: . .  '  : |__ \\  \\    `. |   |   .' \\__\\/: . .|  | '     '  : |__  \r\n" + 
				"  .   \\    .\\  ;|  |  ' | : ,\" .--.; |  |  | '.'| `----.   \\'   :  '   ,\" .--.; |;  : |     |  | '.'| \r\n" + 
				"   \\   \\   ' \\ ||  :  :_:,'/  /  ,.  |  ;  :    ;/  /`--'  /|   |  |  /  /  ,.  ||  , ;     ;  :    ; \r\n" + 
				"    :   '  |--\" |  | ,'   ;  :   .'   \\ |  ,   /'--'.     / |   :  \\ ;  :   .'   \\---'      |  ,   /  \r\n" + 
				"     \\   \\ ;    `--''     |  ,     .-./  ---`-'   `--'---'  |   | ,' |  ,     .-./           ---`-'   \r\n" + 
				"      '---\"                `--`---'                         `----'    `--`---'                        \r\n" + 
				"                                                                                                      ");
		
		System.out.println("\t\t\t                                                                                                                                                                                                       \r\n" + 
				"                                                                                                                                                                                                        \r\n" + 
				"  iiii                     iiii                        iiii                                                                                                    iiii                                     \r\n" + 
				" i::::i                   i::::i                      i::::i                                                                                                  i::::i                                    \r\n" + 
				"  iiii                     iiii                        iiii                                                                                                    iiii                                     \r\n" + 
				"                                                                                                                                                                                                        \r\n" + 
				"iiiiiiinnnn  nnnnnnnn    iiiiiii     cccccccccccccccciiiiiii   aaaaaaaaaaaaa  rrrrr   rrrrrrrrr            ssssssssss       eeeeeeeeeeee        ssssssssss   iiiiiii    ooooooooooo   nnnn  nnnnnnnn    \r\n" + 
				"i:::::in:::nn::::::::nn  i:::::i   cc:::::::::::::::ci:::::i   a::::::::::::a r::::rrr:::::::::r         ss::::::::::s    ee::::::::::::ee    ss::::::::::s  i:::::i  oo:::::::::::oo n:::nn::::::::nn  \r\n" + 
				" i::::in::::::::::::::nn  i::::i  c:::::::::::::::::c i::::i   aaaaaaaaa:::::ar:::::::::::::::::r      ss:::::::::::::s  e::::::eeeee:::::eess:::::::::::::s  i::::i o:::::::::::::::on::::::::::::::nn \r\n" + 
				" i::::inn:::::::::::::::n i::::i c:::::::cccccc:::::c i::::i            a::::arr::::::rrrrr::::::r     s::::::ssss:::::se::::::e     e:::::es::::::ssss:::::s i::::i o:::::ooooo:::::onn:::::::::::::::n\r\n" + 
				" i::::i  n:::::nnnn:::::n i::::i c::::::c     ccccccc i::::i     aaaaaaa:::::a r:::::r     r:::::r      s:::::s  ssssss e:::::::eeeee::::::e s:::::s  ssssss  i::::i o::::o     o::::o  n:::::nnnn:::::n\r\n" + 
				" i::::i  n::::n    n::::n i::::i c:::::c              i::::i   aa::::::::::::a r:::::r     rrrrrrr        s::::::s      e:::::::::::::::::e    s::::::s       i::::i o::::o     o::::o  n::::n    n::::n\r\n" + 
				" i::::i  n::::n    n::::n i::::i c:::::c              i::::i  a::::aaaa::::::a r:::::r                       s::::::s   e::::::eeeeeeeeeee        s::::::s    i::::i o::::o     o::::o  n::::n    n::::n\r\n" + 
				" i::::i  n::::n    n::::n i::::i c::::::c     ccccccc i::::i a::::a    a:::::a r:::::r                 ssssss   s:::::s e:::::::e           ssssss   s:::::s  i::::i o::::o     o::::o  n::::n    n::::n\r\n" + 
				"i::::::i n::::n    n::::ni::::::ic:::::::cccccc:::::ci::::::ia::::a    a:::::a r:::::r                 s:::::ssss::::::se::::::::e          s:::::ssss::::::si::::::io:::::ooooo:::::o  n::::n    n::::n\r\n" + 
				"i::::::i n::::n    n::::ni::::::i c:::::::::::::::::ci::::::ia:::::aaaa::::::a r:::::r                 s::::::::::::::s  e::::::::eeeeeeee  s::::::::::::::s i::::::io:::::::::::::::o  n::::n    n::::n\r\n" + 
				"i::::::i n::::n    n::::ni::::::i  cc:::::::::::::::ci::::::i a::::::::::aa:::ar:::::r                  s:::::::::::ss    ee:::::::::::::e   s:::::::::::ss  i::::::i oo:::::::::::oo   n::::n    n::::n\r\n" + 
				"iiiiiiii nnnnnn    nnnnnniiiiiiii    cccccccccccccccciiiiiiii  aaaaaaaaaa  aaaarrrrrrr                   sssssssssss        eeeeeeeeeeeeee    sssssssssss    iiiiiiii   ooooooooooo     nnnnnn    nnnnnn\r\n" + 
				"                                                                                                                                                                                                        ");
		//Keny
		//Albert
		
	}
}
