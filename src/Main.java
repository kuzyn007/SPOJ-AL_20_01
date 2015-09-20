/**
 * Autor kodu: Sewery Adamczyk
 * Pochodzenie: http://pl.spoj.com/problems/AL_20_01/
 */

import java.util.*;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
				
		while(in.hasNextLine())
		{
			String n = in.nextLine();
			n = n.toLowerCase();
			char znak;
			for(int i=0; i<n.length();i++)
			{
				znak = n.charAt(i);
				String ZnakZmiany = Character.toString(znak);
				if(znak == 32)
				{
					ZnakZmiany = new String("/");
				}
				else if(znak == 'a')
				{
					ZnakZmiany = new String(".-/");
				}
				else if(znak == 'b')
				{
					ZnakZmiany = new String("-.../");
				}
				else if(znak == 'c')
				{
					ZnakZmiany = new String("-.-./");
				}
				else if(znak == 'd')
				{
					ZnakZmiany = new String("-../");
				}
				else if(znak == 'e')
				{
					ZnakZmiany = new String("./");
				}
				else if(znak == 'f')
				{
					ZnakZmiany = new String(".-../");
				}
				else if(znak == 'g')
				{
					ZnakZmiany = new String("--./");
				}
				else if(znak == 'h')
				{
					ZnakZmiany = new String("..../");
				}
				else if(znak == 'i')
				{
					ZnakZmiany = new String("../");
				}
				else if(znak == 'j')
				{
					ZnakZmiany = new String(".---/");
				}
				else if(znak == 'k')
				{
					ZnakZmiany = new String("-.-/");
				}
				else if(znak == 'l')
				{
					ZnakZmiany = new String("..-./");
				}
				else if(znak == 'm')
				{
					ZnakZmiany = new String("--/");
				}
				else if(znak == 'n')
				{
					ZnakZmiany = new String("-./");
				}
				else if(znak == 'o')
				{
					ZnakZmiany = new String("---/");
				}
				else if(znak == 'p')
				{
					ZnakZmiany = new String(".--./");
				}
				else if(znak == 'q')
				{
					ZnakZmiany = new String("--.-/");
				}
				else if(znak == 'r')
				{
					ZnakZmiany = new String(".-./");
				}
				else if(znak == 's')
				{
					ZnakZmiany = new String(".../");
				}
				else if(znak == 't')
				{
					ZnakZmiany = new String("-/");
				}
				else if(znak == 'u')
				{
					ZnakZmiany = new String("..-/");
				}
				else if(znak == 'v')
				{
					ZnakZmiany = new String("...-/");
				}
				else if(znak == 'w')
				{
					ZnakZmiany = new String(".--/");
				}
				else if(znak == 'x')
				{
					ZnakZmiany = new String("-..-/");
				}
				else if(znak == 'y')
				{
					ZnakZmiany = new String("-.--/");
				}
				else if(znak == 'z')
				{
					ZnakZmiany = new String("--../");
				}
				System.out.print(ZnakZmiany);
			}
			System.out.println();
		}
		
		in.close();
	}

}

