package com.example.googleplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgView1 = findViewById<ImageView>(R.id.imgEnrolados)
        val imgView2 = findViewById<ImageView>(R.id.imgWinx)
        val imgView3 = findViewById<ImageView>(R.id.imgBarbie)
        val imgView4 = findViewById<ImageView>(R.id.imgSpider)
        val imgView5 = findViewById<ImageView>(R.id.imgCarrossel)
        val imgView6 = findViewById<ImageView>(R.id.imgMeangirls)
        val imgView7 = findViewById<ImageView>(R.id.imgAnyone)
        val imgView8 = findViewById<ImageView>(R.id.imgAllboys)
        val imgView9 = findViewById<ImageView>(R.id.imgJulieta)
        val imgView10 = findViewById<ImageView>(R.id.imgYou)
        val imgView11 = findViewById<ImageView>(R.id.imgB99)
        val imgView12 = findViewById<ImageView>(R.id.imgTeenwolf)
        val imgView13 = findViewById<ImageView>(R.id.imgGente)
        val imgView14 = findViewById<ImageView>(R.id.imgArcane)
        val imgView15 = findViewById<ImageView>(R.id.imgEsposa)

        imgView1.setOnClickListener{
            val Intent = Intent(this, Detalhes2::class.java).apply {
                val titulo = "ENROLADOS"
                val info = "Animação/família | 2010 | 1h41min"
                val sinopse =  "Rapunzel, uma jovem inocente, é presa por sua mãe excessivamente protetora. Seu desejo de escapar para o mundo exterior finalmente se torna realidade quando ela conhece o ladrão de bom coração Flynn."
                val direcao = "Direção: Nathan Greno e Byron Howard"

                putExtra("id_img", R.drawable.enrolados)
                putExtra("titulo", titulo)
                putExtra("info", info)
                putExtra("sinopse", sinopse)
                putExtra("direcao", direcao)
            }
            Toast.makeText(this, "Enrolados", LENGTH_SHORT).show()
            startActivity(Intent)
        }

        imgView2.setOnClickListener{
            val Intent = Intent(this, Detalhes2::class.java).apply {
                val titulo = "O CLUBE DAS WINX"
                val info = "Ação/Animação/família | 2004 | 7 temporadas"
                val sinopse = "Bloom é uma garota com superpoderes que decide estudar na Escola de Fadas para aprimorar suas habilidades. Logo ela conhece Stella, Flora, Musa, Layla e Tecna, formando um grupo de heroínas preparadas para salvar o universo de qualquer perigo."
                val direcao = "Criado por: Iginio Straffi"

                putExtra("id_img", R.drawable.winx)
                putExtra("titulo", titulo)
                putExtra("info", info)
                putExtra("sinopse", sinopse)
                putExtra("direcao", direcao)
            }
            Toast.makeText(this, "O Clube das Winx", LENGTH_SHORT).show()
            startActivity(Intent)
        }

        imgView3.setOnClickListener{
            val Intent = Intent(this, Detalhes2::class.java).apply {
                val titulo = "BARBIE MODA E MAGIA"
                val info = "Aventura/Família | 2010 | 1h19min"
                val sinopse = "Após perder seu emprego e seu namorado, Barbie resolve visitar sua tia estilista Millicent em Paris, para consertar seu coração quebrado. Mas ao chegar, se depara com mais problemas: a empresa de design de sua tia está falindo."
                val direcao = "Direção: William Lau"

                putExtra("id_img", R.drawable.barbie)
                putExtra("titulo", titulo)
                putExtra("info", info)
                putExtra("sinopse", sinopse)
                putExtra("direcao", direcao)
            }
            Toast.makeText(this, "Barbie Moda e Magia", LENGTH_SHORT).show()
            startActivity(Intent)
        }

        imgView4.setOnClickListener{
            val Intent = Intent(this, Detalhes2::class.java).apply {
                val titulo = "HOMEM-ARANHA: ATRAVÉS DO ARANHAVERSO"
                val info = "Ação/Aventura/Animação | 2023 | 2h21min"
                val sinopse = "Após encontrar Gwen Stacy, o amigável Homem-Aranha é catapultado através do Multiverso, onde ele encontra uma equipe de Pessoas-Aranha encarregadas de proteger sua existência. Porém os heróis entram em conflito sobre como lidar com uma nova ameaça e Miles se vê confrontado com os outros Aranhas."
                val direcao = "Direção: Joaquim Dos Santos, Kemp Powers, Justin K. Thompson"

                putExtra("id_img", R.drawable.spiderverse)
                putExtra("titulo", titulo)
                putExtra("info", info)
                putExtra("sinopse", sinopse)
                putExtra("direcao", direcao)
            }
            Toast.makeText(this, "Homem-Aranha: Através do Aranhaverso", LENGTH_SHORT).show()
            startActivity(Intent)
        }

        imgView5.setOnClickListener{
            val Intent = Intent(this, Detalhes2::class.java).apply {
                val titulo = "CARROSSEL"
                val info = "Novela | 2012 - 2013 | 310 episódios"
                val sinopse = "Helena é uma jovem professora que começa a trabalhar na Escola Mundial. Ela acaba sendo a escolhida para cuidar dos pequenos alunos do terceiro ano, considerados, pela severa diretora Olívia como pestinhas."
                val direcao = "Direção: Luiz Antônio Piá"

                putExtra("id_img", R.drawable.carrossel)
                putExtra("titulo", titulo)
                putExtra("info", info)
                putExtra("sinopse", sinopse)
                putExtra("direcao", direcao)
            }
            Toast.makeText(this, "Carrossel", LENGTH_SHORT).show()
            startActivity(Intent)
        }

        imgView6.setOnClickListener{
            val Intent = Intent(this, Detalhes2::class.java).apply {
                val titulo = "MENINAS MALVADAS"
                val info = "Comédia | 2004 | 1h38min"
                val sinopse = "Cady ingressa em uma nova escola pública e faz amizade com Janis e Damian. Eles avisam Cady para evitar os Plastics, grupo liderado por Regina. As coisas pioram quando ela se apaixona por Aaron, ex-namorado de Regina."
                val direcao = "Direção: Mark Waters"

                putExtra("id_img", R.drawable.meangirls)
                putExtra("titulo", titulo)
                putExtra("info", info)
                putExtra("sinopse", sinopse)
                putExtra("direcao", direcao)
            }
            Toast.makeText(this, "Meninas Malvadas", LENGTH_SHORT).show()
            startActivity(Intent)
        }

        imgView7.setOnClickListener{
            val Intent = Intent(this, Detalhes2::class.java).apply {
                val titulo = "TODOS MENOS VOCÊ"
                val info = "Comédia/Romance | 2024 | 1h44min"
                val sinopse = "Apesar de terem tido um primeiro encontro incrível, a atração inicial de Bea e Ben rapidamente azedou. Quando inesperadamente se encontram em um casamento na Austrália, os dois fingem ser o casal perfeito para manter as aparências."
                val direcao = "Direção: Will Gluck"

                putExtra("id_img", R.drawable.anyonebutyou)
                putExtra("titulo", titulo)
                putExtra("info", info)
                putExtra("sinopse", sinopse)
                putExtra("direcao", direcao)
            }
            Toast.makeText(this, "Todos Menos Você", LENGTH_SHORT).show()
            startActivity(Intent)
        }

        imgView8.setOnClickListener{
            val Intent = Intent(this, Detalhes2::class.java).apply {
                val titulo = "PARA TODOS OS GAROTOS QUE JÁ AMEI"
                val info = "Comédia dramática/Romance | 2018 | 1h39min"
                val sinopse = "Lara Jean Song Covey escreve cartas de amor secretas para todos os seus antigos paqueras. Um dia, essas cartas são misteriosamente enviadas para os meninos, virando sua vida de cabeça para baixo."
                val direcao = "Direção: Susan Johnson"

                putExtra("id_img", R.drawable.todosgarotos)
                putExtra("titulo", titulo)
                putExtra("info", info)
                putExtra("sinopse", sinopse)
                putExtra("direcao", direcao)
            }
            Toast.makeText(this, "Para Todos Os Garotos Que Já Amei", LENGTH_SHORT).show()
            startActivity(Intent)
        }

        imgView9.setOnClickListener{
            val Intent = Intent(this, Detalhes2::class.java).apply {
                val titulo = "CARTAS PARA JULIETA"
                val info = "Comédia/Drama/Romance | 2010 | 1h45min"
                val sinopse = "Enquanto está em Verona, Sophie se junta a um grupo de voluntários que responde cartas em busca de conselhos românticos. Quando ela responde a uma carta de Claire datada de 1957, isso a inspira a procurar seu amor há muito perdido."
                val direcao = "Direção: Gary Winick"

                putExtra("id_img", R.drawable.julieta)
                putExtra("titulo", titulo)
                putExtra("info", info)
                putExtra("sinopse", sinopse)
                putExtra("direcao", direcao)
            }
            Toast.makeText(this, "Cartas para Julieta", LENGTH_SHORT).show()
            startActivity(Intent)
        }

        imgView10.setOnClickListener{
            val Intent = Intent(this, Detalhes2::class.java).apply {
                val titulo = "YOU"
                val info = "Drama/Suspense | 2018 | 5 temporadas"
                val sinopse = "Um gerente de livraria fica apaixonado por uma aspirante a escritora. Como forma de tentar se aproximar, ele pesquisa as redes sociais dela para descobrir seus gostos. O gerente vai ficando cada vez mais obcecado e é capaz de tudo para afastar quem atrapalha seus planos."
                val direcao = "Criado por: Greg Berlanti e Sera Gamble"

                putExtra("id_img", R.drawable.you)
                putExtra("titulo", titulo)
                putExtra("info", info)
                putExtra("sinopse", sinopse)
                putExtra("direcao", direcao)
            }
            Toast.makeText(this, "You", LENGTH_SHORT).show()
            startActivity(Intent)
        }

        imgView11.setOnClickListener{
            val Intent = Intent(this, Detalhes2::class.java).apply {
                val titulo = "BROOKLYN 99"
                val info = "Comédia/Policial | 2013 – 2021 | 8 temporadas"
                val sinopse = "A série Brooklyn Nine-Nine é ambientada na 99ª Delegacia de Polícia de Nova York, no Brooklyn, acompanhando as maluquices do imaturo detetive Jake Peralta e a relação que ele tem com o novo capitão, Ray Holt."
                val direcao = "Criado por: Dan Goor e Michael Schur"

                putExtra("id_img", R.drawable.b99)
                putExtra("titulo", titulo)
                putExtra("info", info)
                putExtra("sinopse", sinopse)
                putExtra("direcao", direcao)
            }
            Toast.makeText(this, "Brooklyn 99", LENGTH_SHORT).show()
            startActivity(Intent)
        }

        imgView12.setOnClickListener{
            val Intent = Intent(this, Detalhes2::class.java).apply {
                val titulo = "TEEN WOLF"
                val info = "Drama/Fantasia | 2011 – 2017 | 6 temporadas"
                val sinopse = "Era noite quando Scott McCall andava pela floresta e foi atacado por um lobisomem. O pior não aconteceu e ele conseguiu chegar vivo em casa, mas algum tempo depois começou a notar mudanças em si mesmo. Ele tenta a todo custo levar uma vida normal, mas não é nada fácil esconder sua segunda natureza."
                val direcao = "Criado por: Jeff Davis"

                putExtra("id_img", R.drawable.teenwolf)
                putExtra("titulo", titulo)
                putExtra("info", info)
                putExtra("sinopse", sinopse)
                putExtra("direcao", direcao)
            }
            Toast.makeText(this, "Teen Wolf", LENGTH_SHORT).show()
            startActivity(Intent)
        }

        imgView13.setOnClickListener{
            val Intent = Intent(this, Detalhes2::class.java).apply {
                val titulo = "GENTE GRANDE"
                val info = "Comédia | 2010 | 1h42min"
                val sinopse = "Cinco amigos de infância levam suas famílias para uma viagem de fim de semana a uma casa no lago em sua cidade natal, onde se reúnem para assistir ao funeral de seu ex-técnico de basquete do ensino médio."
                val direcao = "Direção: Dennis Dugan"

                putExtra("id_img", R.drawable.gentegrande)
                putExtra("titulo", titulo)
                putExtra("info", info)
                putExtra("sinopse", sinopse)
                putExtra("direcao", direcao)
            }
            Toast.makeText(this, "Gente Grande", LENGTH_SHORT).show()
            startActivity(Intent)
        }

        imgView14.setOnClickListener{
            val Intent = Intent(this, Detalhes2::class.java).apply {
                val titulo = "ARCANE"
                val info = "Animação/Ficção científica | 2021 | 1 temporada"
                val sinopse = "Em meio ao conflito entre as cidades-gêmeas de Piltover e Zaun, duas irmãs lutam em lados opostos de uma guerra entre tecnologias mágicas e convicções incompatíveis. Assista o quanto quiser."
                val direcao = "Criado por: Riot Games"

                putExtra("id_img", R.drawable.arcane)
                putExtra("titulo", titulo)
                putExtra("info", info)
                putExtra("sinopse", sinopse)
                putExtra("direcao", direcao)
            }
            Toast.makeText(this, "Arcane", LENGTH_SHORT).show()
            startActivity(Intent)
        }

        imgView15.setOnClickListener{
            val Intent = Intent(this, Detalhes2::class.java).apply {
                val titulo = "ESPOSA DE MENTIRINHA"
                val info = "Comédia/Romance | 2011 | 1h51min"
                val sinopse = "Um cirurgião plástico passa anos fingindo ser casado, até que conhece a mulher perfeita. Agora, ele precisa que sua assistente se passe por sua futura ex. "
                val direcao = "Direção: Dennis Dugan"

                putExtra("id_img", R.drawable.justgo)
                putExtra("titulo", titulo)
                putExtra("info", info)
                putExtra("sinopse", sinopse)
                putExtra("direcao", direcao)
            }
            Toast.makeText(this, "Esposa de Mentirinha", LENGTH_SHORT).show()
            startActivity(Intent)
        }
    }
}