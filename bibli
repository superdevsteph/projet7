--
-- PostgreSQL database dump
--

-- Dumped from database version 12.2
-- Dumped by pg_dump version 12.2

-- Started on 2020-07-03 10:48:08 CEST

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

DROP DATABASE bibliotheque;
--
-- TOC entry 3192 (class 1262 OID 16393)
-- Name: bibliotheque; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE bibliotheque WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'C' LC_CTYPE = 'C';


ALTER DATABASE bibliotheque OWNER TO postgres;

\connect bibliotheque

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 203 (class 1259 OID 16396)
-- Name: book; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.book (
    id integer NOT NULL,
    bookname character varying NOT NULL,
    bookauthor character varying NOT NULL,
    bookpictureurl character varying NOT NULL,
    bookdescription character varying NOT NULL,
    booklabel character varying NOT NULL,
    allbookreserved boolean NOT NULL
);


ALTER TABLE public.book OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 16394)
-- Name: book_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.book_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.book_id_seq OWNER TO postgres;

--
-- TOC entry 3193 (class 0 OID 0)
-- Dependencies: 202
-- Name: book_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.book_id_seq OWNED BY public.book.id;


--
-- TOC entry 210 (class 1259 OID 16435)
-- Name: bookreservation; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.bookreservation (
    id integer NOT NULL,
    beginofreservationdate character varying NOT NULL,
    endofreservationdate character varying NOT NULL,
    extensionofreservation boolean NOT NULL,
    bookback boolean NOT NULL,
    user_id integer NOT NULL,
    book_id integer NOT NULL,
    library_id integer NOT NULL
);


ALTER TABLE public.bookreservation OWNER TO postgres;

--
-- TOC entry 209 (class 1259 OID 16433)
-- Name: bookreservation_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.bookreservation_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.bookreservation_id_seq OWNER TO postgres;

--
-- TOC entry 3194 (class 0 OID 0)
-- Dependencies: 209
-- Name: bookreservation_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.bookreservation_id_seq OWNED BY public.bookreservation.id;


--
-- TOC entry 205 (class 1259 OID 16407)
-- Name: library; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.library (
    id integer NOT NULL,
    libraryname character varying NOT NULL
);


ALTER TABLE public.library OWNER TO postgres;

--
-- TOC entry 204 (class 1259 OID 16405)
-- Name: library_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.library_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.library_id_seq OWNER TO postgres;

--
-- TOC entry 3195 (class 0 OID 0)
-- Dependencies: 204
-- Name: library_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.library_id_seq OWNED BY public.library.id;


--
-- TOC entry 206 (class 1259 OID 16416)
-- Name: librarycatalog; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.librarycatalog (
    library_id integer NOT NULL,
    book_id integer NOT NULL,
    bookiteration integer NOT NULL
);


ALTER TABLE public.librarycatalog OWNER TO postgres;

--
-- TOC entry 208 (class 1259 OID 16423)
-- Name: libraryuser; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.libraryuser (
    id integer NOT NULL,
    userfirstname character varying NOT NULL,
    username character varying NOT NULL,
    userpassword character varying NOT NULL,
    useremail character varying NOT NULL
);


ALTER TABLE public.libraryuser OWNER TO postgres;

--
-- TOC entry 207 (class 1259 OID 16421)
-- Name: libraryuser_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.libraryuser_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.libraryuser_id_seq OWNER TO postgres;

--
-- TOC entry 3196 (class 0 OID 0)
-- Dependencies: 207
-- Name: libraryuser_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.libraryuser_id_seq OWNED BY public.libraryuser.id;


--
-- TOC entry 3032 (class 2604 OID 16399)
-- Name: book id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.book ALTER COLUMN id SET DEFAULT nextval('public.book_id_seq'::regclass);


--
-- TOC entry 3035 (class 2604 OID 16438)
-- Name: bookreservation id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.bookreservation ALTER COLUMN id SET DEFAULT nextval('public.bookreservation_id_seq'::regclass);


--
-- TOC entry 3033 (class 2604 OID 16410)
-- Name: library id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.library ALTER COLUMN id SET DEFAULT nextval('public.library_id_seq'::regclass);


--
-- TOC entry 3034 (class 2604 OID 16426)
-- Name: libraryuser id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.libraryuser ALTER COLUMN id SET DEFAULT nextval('public.libraryuser_id_seq'::regclass);


--
-- TOC entry 3179 (class 0 OID 16396)
-- Dependencies: 203
-- Data for Name: book; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.book (id, bookname, bookauthor, bookpictureurl, bookdescription, booklabel, allbookreserved) VALUES (5, 'l''appel de la foret', 'Jack London', 'assets/img/L-appel-de-la-foret.jpg', 'Dérobé à ses maîtres pour être vendu à des chercheurs d''or du Klondike, Buck devient chien de traîneau et fait l''apprentissage du froid, de la brutalité impitoyable, de la douleur... jusqu''à ce que, un jour, retentisse l''appel de la forêt. À partir de là, plus rien ne le relie aux hommes...Le grand classique de la vie sauvage et de la ruée vers l''or. ', 'Roman junior', true);
INSERT INTO public.book (id, bookname, bookauthor, bookpictureurl, bookdescription, booklabel, allbookreserved) VALUES (2, 'le horla', 'Guy De Maupassant', 'assets/img/Le-Horla.jpg', 'un matin, comme je me promenais près de mon parterre de rosiers, je vis, je vis distinctement tout près de moi, la tige d''une des plus belles roses se casser comme si une main invisible l''eût cueillie, la fleur resta suspendue dans l''air transparent, toute seule, immobile, effrayante, à trois pas de mes yeux.
Saisi d''une épouvante folle, je me jetai sur elle pour la saisir. Je ne trouvai rien. Elle avait disparu...
à partir de ce moment-là, je sus qu''il existait près de moi un être invisible qui m''avait hanté et qui revenait. Un peu plus tard, j''en eus la preuve. »
Confession lucide et maîtrisée d''un homme qui assiste au naufrage de sa propre raison, Le Horla nous révèle la trajectoire secrète et fulgurante qui relie la plénitude de la santé au martyre de la démence. Nul autre récit fantastique - en raison, peut-être, de certains accents autobiographiques - n''a développé avec plus de rigueur et de vérité clinique l''implacable logique de l''imaginaire.', 'Nouvelle', true);
INSERT INTO public.book (id, bookname, bookauthor, bookpictureurl, bookdescription, booklabel, allbookreserved) VALUES (4, 'le signal', 'Maxime Chattam', 'assets/img/Le-Signal.jpg', 'La famille Spencer vient de s’installer à Mahingan Falls. Jusqu’ici, tout va bien. Un vrai paradis. Si ce n’étaient ces vieilles rumeurs de sorcellerie, ces communications téléphoniques brouillées par des cris inhumains, ce quelque chose d’effrayant dans la forêt qui pourchasse leurs adolescents, et ce shérif dépassé par des crimes horribles. Avez-vous déjà eu vraiment peur en lisant un livre ?', 'Fantastique', true);
INSERT INTO public.book (id, bookname, bookauthor, bookpictureurl, bookdescription, booklabel, allbookreserved) VALUES (6, 'la ferme du bout du monde', 'Vaughan Sarah', 'assets/img/La-Ferme-du-bout-du-monde.jpg', 'Cornouailles, une ferme isolée au sommet d’une falaise. Battus par les vents de la lande et les embruns, ses murs abritent depuis trois générations une famille… et ses secrets.1939. Will et Alice trouvent refuge auprès de Maggie, la fille du fermier. Ils vivent une enfance protégée des ravages de la guerre. Jusqu’à cet été 1943 qui bouleverse leur destin. Été 2014. La jeune Lucy, trompée par son mari, rejoint la ferme de sa grand-mère Maggie. Mais rien ne l’a préparée à ce qu’elle y découvrira. Deux étés, séparés par un drame inavouable. Peut-on tout réparer soixante-dix ans plus tard ?', 'Roman', true);
INSERT INTO public.book (id, bookname, bookauthor, bookpictureurl, bookdescription, booklabel, allbookreserved) VALUES (7, 'fait maison n°1 - par cyril Llgnac
', 'Cyril Lignac', 'assets/img/Fait-maison-n-1-Par-Cyril-Lignac.jpg', 'Cyril Lignac cuisine chez lui pour toi !

Envie d''une cuisine maison savoureuse et rapide ? En direct de sa cuisine, Cyril Lignac te propose 45 recettes salées et/ou sucrées pour mettre un peu de peps dans ton quotidien.

Un risotto aux coquillettes, un poisson au four à l''huile vierge et aux petits légumes ou encore une fabuleuse tarte aux fraises ou des petits pots de crème à la vanille... Tu vas te régaler en toute simplicité !

Un livre indispensable, ultra-pratique et sans prétention, pour égayer tes déjeuners et dîners ; des recettes gourmandes, croquantes, craquantes, à déguster en solo, à deux, en famille ou entre amis.

Avec Cyril, le fait-maison c''est ultra-facile ! Mets ton tablier et laisse-toi guider par ses précieux conseils et ses recettes ultra-réconfortantes.', 'Cuisine Gastronomie', true);
INSERT INTO public.book (id, bookname, bookauthor, bookpictureurl, bookdescription, booklabel, allbookreserved) VALUES (1, 'le fléau', 'Stephen King', 'assets/img/Le-fleau.jpg', 'Il a suffi que l’ordinateur d’un laboratoire ultra-secret de l’armée américaine fasse une erreur d’une nanoseconde pour que la chaîne de la mort se mette en marche. Le Fléau, inexorablement, se répand sur l’Amérique et, de New York à Los Angeles, transforme un bel été en cauchemar. Avec un taux de contamination de 99,4 %.
Dans ce monde d’apocalypse émerge alors une poignée de survivants hallucinés. Ils ne se connaissent pas, pourtant chacun veut rejoindre celle que, dans leurs rêves, ils appellent Mère Abigaël : une vieille Noire de cent huit ans dont dépend leur salut commun. Mais ils savent aussi que sur cette terre dévastée rôde l’Homme sans visage, l’Homme Noir aux étranges pouvoirs, Randall Flagg. L’incarnation des fantasmes les plus diaboliques, destinée à régner sur ce monde nouveau.
C’est la fin des Temps, et le dernier combat entre le Bien et le Mal peut commencer.', 'Fantastique', false);
INSERT INTO public.book (id, bookname, bookauthor, bookpictureurl, bookdescription, booklabel, allbookreserved) VALUES (3, 'hunger games', 'Suzanne Collins', 'assets/img/Hunger-Games-La-ballade-du-serpent-et-de-l-oiseau-chanteur.jpg', 'Poussé par la compétition
Il va découvrir que la soif de pouvoir a un prix

C''est le matin de la Moisson qui doit ouvrir la dixième édition annuelle des Hunger Games. Au Capitole, Coriolanus Snow, dix-huit ans, se prépare à devenir pour la première fois mentor aux Jeux. L''avenir de la maison Snow, qui a connu des jours meilleurs, est désormais suspendu aux maigres chances de Coriolanus. Il devra faire preuve de charme, d''astuce et d''inventivité pour faire gagner sa candidate.
Mais le sort s''acharne. Honte suprême, on lui a confié le plus misérable des tributs : une fille du district Douze. Leurs destins sont désormais liés. Chaque décision peut les conduire à la réussite ou à l''échec, au triomphe ou à la ruine.
Dans l''arène, ce sera un combat à mort.
Pour assouvir son ambition, Coriolanus parviendra-t-il à réprimer l''affection grandissante qu''il ressent pour sa candidate, condamnée d''avance ?', 'Fantastique', false);


--
-- TOC entry 3186 (class 0 OID 16435)
-- Dependencies: 210
-- Data for Name: bookreservation; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (1, '19/06/2019', '15/07/2019', false, false, 1, 2, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (8, '26/04/2020', '21/06/2020', true, true, 3, 1, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (42, '04/06/2020', '30/07/2020', true, true, 3, 1, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (9, '26/04/2020', '21/06/2020', true, true, 3, 1, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (70, '12/06/2020', '10/07/2020', false, true, 3, 3, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (12, '22/05/2020', '17/07/2020', true, true, 3, 3, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (11, '22/05/2020', '17/07/2020', true, true, 3, 4, 2);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (67, '12/06/2020', '10/07/2020', false, true, 3, 1, 2);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (69, '12/06/2020', '10/07/2020', false, true, 3, 1, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (10, '22/05/2020', '17/07/2020', true, true, 3, 4, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (13, '23/05/2020', '18/07/2020', true, true, 3, 6, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (15, '23/05/2020', '20/06/2020', false, true, 3, 3, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (66, '12/06/2020', '07/08/2020', true, true, 3, 3, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (16, '23/05/2020', '20/06/2020', false, true, 3, 7, 2);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (44, '04/06/2020', '30/07/2020', true, true, 3, 6, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (45, '04/06/2020', '02/07/2020', false, true, 3, 3, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (46, '04/06/2020', '02/07/2020', false, true, 3, 3, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (49, '04/06/2020', '02/07/2020', false, false, 8, 6, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (50, '04/06/2020', '30/07/2020', true, true, 8, 4, 2);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (14, '23/05/2020', '18/07/2020', true, true, 3, 5, 2);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (17, '23/05/2020', '18/07/2020', true, true, 3, 3, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (18, '23/05/2020', '18/07/2020', true, true, 3, 7, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (20, '28/05/2020', '23/07/2020', true, true, 3, 5, 2);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (19, '23/05/2020', '18/07/2020', true, true, 3, 4, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (21, '28/05/2020', '23/07/2020', true, true, 3, 6, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (22, '28/05/2020', '23/07/2020', true, true, 3, 1, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (30, '28/05/2020', '23/07/2020', true, true, 5, 3, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (31, '28/05/2020', '25/06/2020', false, false, 5, 5, 2);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (32, '28/05/2020', '25/06/2020', false, false, 5, 5, 2);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (26, '28/05/2020', '23/07/2020', true, true, 3, 1, 2);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (33, '28/05/2020', '25/06/2020', false, true, 3, 4, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (23, '28/05/2020', '23/07/2020', true, true, 3, 4, 2);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (25, '28/05/2020', '23/07/2020', true, true, 3, 7, 2);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (72, '20/06/2020', '18/07/2020', false, true, 3, 1, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (28, '28/05/2020', '23/07/2020', true, true, 3, 1, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (24, '28/05/2020', '23/07/2020', true, true, 3, 7, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (27, '28/05/2020', '23/07/2020', true, true, 3, 3, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (29, '28/05/2020', '23/07/2020', true, true, 3, 3, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (34, '28/05/2020', '25/06/2020', false, true, 3, 4, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (71, '13/06/2020', '08/08/2020', true, true, 3, 1, 2);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (38, '29/05/2020', '26/06/2020', false, true, 3, 7, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (35, '28/05/2020', '25/06/2020', false, true, 3, 6, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (36, '28/05/2020', '23/07/2020', true, true, 3, 4, 2);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (40, '29/05/2020', '26/06/2020', false, true, 3, 7, 2);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (52, '05/06/2020', '31/07/2020', true, false, 11, 7, 2);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (51, '05/06/2020', '31/07/2020', true, true, 11, 4, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (56, '05/06/2020', '31/07/2020', true, false, 11, 4, 2);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (55, '05/06/2020', '31/07/2020', true, false, 11, 4, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (54, '05/06/2020', '31/07/2020', true, false, 11, 1, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (53, '05/06/2020', '31/07/2020', true, false, 11, 7, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (43, '04/06/2020', '02/07/2020', false, true, 3, 7, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (47, '04/06/2020', '02/07/2020', false, true, 3, 3, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (48, '04/06/2020', '02/07/2020', false, true, 3, 3, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (41, '29/05/2020', '26/06/2020', false, true, 3, 3, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (37, '28/05/2020', '23/07/2020', true, true, 3, 3, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (39, '29/05/2020', '24/07/2020', true, true, 3, 1, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (59, '05/06/2020', '31/07/2020', true, true, 3, 1, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (64, '12/06/2020', '07/08/2020', true, false, 3, 7, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (60, '12/06/2020', '07/08/2020', true, true, 3, 3, 2);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (57, '05/06/2020', '31/07/2020', true, true, 3, 3, 2);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (58, '05/06/2020', '31/07/2020', true, true, 3, 1, 2);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (61, '12/06/2020', '07/08/2020', true, true, 3, 3, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (62, '12/06/2020', '07/08/2020', true, true, 3, 3, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (63, '12/06/2020', '07/08/2020', true, true, 3, 3, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (65, '12/06/2020', '07/08/2020', true, true, 3, 1, 1);
INSERT INTO public.bookreservation (id, beginofreservationdate, endofreservationdate, extensionofreservation, bookback, user_id, book_id, library_id) VALUES (68, '12/06/2020', '10/07/2020', false, false, 3, 3, 2);


--
-- TOC entry 3181 (class 0 OID 16407)
-- Dependencies: 205
-- Data for Name: library; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.library (id, libraryname) VALUES (1, 'Bibli 1');
INSERT INTO public.library (id, libraryname) VALUES (2, 'Bibli 2');


--
-- TOC entry 3182 (class 0 OID 16416)
-- Dependencies: 206
-- Data for Name: librarycatalog; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.librarycatalog (library_id, book_id, bookiteration) VALUES (1, 1, 2);
INSERT INTO public.librarycatalog (library_id, book_id, bookiteration) VALUES (1, 2, 1);
INSERT INTO public.librarycatalog (library_id, book_id, bookiteration) VALUES (2, 1, 1);
INSERT INTO public.librarycatalog (library_id, book_id, bookiteration) VALUES (1, 3, 3);
INSERT INTO public.librarycatalog (library_id, book_id, bookiteration) VALUES (1, 4, 1);
INSERT INTO public.librarycatalog (library_id, book_id, bookiteration) VALUES (2, 4, 1);
INSERT INTO public.librarycatalog (library_id, book_id, bookiteration) VALUES (2, 5, 2);
INSERT INTO public.librarycatalog (library_id, book_id, bookiteration) VALUES (1, 6, 1);
INSERT INTO public.librarycatalog (library_id, book_id, bookiteration) VALUES (1, 7, 2);
INSERT INTO public.librarycatalog (library_id, book_id, bookiteration) VALUES (2, 7, 1);
INSERT INTO public.librarycatalog (library_id, book_id, bookiteration) VALUES (2, 3, 2);


--
-- TOC entry 3184 (class 0 OID 16423)
-- Dependencies: 208
-- Data for Name: libraryuser; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.libraryuser (id, userfirstname, username, userpassword, useremail) VALUES (3, 'stephanie', 'mehraik', '$2a$10$p.KrJkVacYw01F/tsffFkuOP3ZP4yZsx.vAOQClnDbv11hae0nwQS', 'steph.bibli@gmail.com');
INSERT INTO public.libraryuser (id, userfirstname, username, userpassword, useremail) VALUES (5, 'jl', 'gui', '$2a$10$S/LgYKCThsDVLPRhjA13dub.KEdx72VyGSWERbO7wzmiEVBLYnduq', 'jl@gui.fr');
INSERT INTO public.libraryuser (id, userfirstname, username, userpassword, useremail) VALUES (6, 'bla', 'bla', '$2a$10$MESboPMw3X/aHEgRWKance6K9EoggpIm83A1gzouToSEGkjKP7ZEy', 'bla@bla.fr');
INSERT INTO public.libraryuser (id, userfirstname, username, userpassword, useremail) VALUES (8, 'jl', 'bibli', '$2a$10$AzUR28GDv8s4/FguHLEqKeZ.BcPuvQpkk4EOwHIMuTDalw6oRmFaa', 'jl@bibli.com');
INSERT INTO public.libraryuser (id, userfirstname, username, userpassword, useremail) VALUES (9, 'bla', 'bla', '$2a$10$uGsU89UAzGOVJQ/wJcasweaF51nM/5V62Ad28ZRnBCDyDXrO/W.eK', 'batman@gmail.com');
INSERT INTO public.libraryuser (id, userfirstname, username, userpassword, useremail) VALUES (10, 'jl', 'guillon', '$2a$10$S98UvjOKdQhAV32vrQwEueBN7QMs55TkkXTEj24gK6H0qm9Th2aTq', 'jl.guillon@gmail.com');
INSERT INTO public.libraryuser (id, userfirstname, username, userpassword, useremail) VALUES (11, 'amy', 'guillon', '$2a$10$U.P8jh6ScIAuRQYz1.4u7u44sf9iP1p8oHBIpiCIiyykE5LZHAVWS', 'amy.guillon@gmail.com');
INSERT INTO public.libraryuser (id, userfirstname, username, userpassword, useremail) VALUES (1, 'michel', 'froger', '$2a$10$izLvX7nRBB6qohlBCiGEzOHwlCLRoUwAJ0hChn.JAnhXDZp2MT3P.', 'michel.froger@gmail.com');
INSERT INTO public.libraryuser (id, userfirstname, username, userpassword, useremail) VALUES (2, 'fabien', 'bartez', '$2a$10$Loe8.FEvR6CQL6GwhzX2ieJKd0SwkZi1ChwEY36i1fQxh.7zfiyTS', 'fabien.bartez@gmail.com');
INSERT INTO public.libraryuser (id, userfirstname, username, userpassword, useremail) VALUES (16, 'mia', 'guillon', '$2a$10$RIqFMf0fsVG94y9vPYiFve0FTWqKAPVO9OlZxuMoH9WNj4JW1Pc.u', 'mia.guillon@gmail.com');
INSERT INTO public.libraryuser (id, userfirstname, username, userpassword, useremail) VALUES (17, 'toto', 'roro', '$2a$10$HoH/V4.M1EbhPIhpE581hOlh741L.YpsrYPJxRA.vzRiingBdtBUu', 'totoro@gmail.com');


--
-- TOC entry 3197 (class 0 OID 0)
-- Dependencies: 202
-- Name: book_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.book_id_seq', 72, true);


--
-- TOC entry 3198 (class 0 OID 0)
-- Dependencies: 209
-- Name: bookreservation_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.bookreservation_id_seq', 1, true);


--
-- TOC entry 3199 (class 0 OID 0)
-- Dependencies: 204
-- Name: library_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.library_id_seq', 2, true);


--
-- TOC entry 3200 (class 0 OID 0)
-- Dependencies: 207
-- Name: libraryuser_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.libraryuser_id_seq', 17, true);


--
-- TOC entry 3037 (class 2606 OID 16404)
-- Name: book book_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.book
    ADD CONSTRAINT book_pk PRIMARY KEY (id);


--
-- TOC entry 3046 (class 2606 OID 16443)
-- Name: bookreservation bookreservation_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.bookreservation
    ADD CONSTRAINT bookreservation_pk PRIMARY KEY (id);


--
-- TOC entry 3039 (class 2606 OID 16415)
-- Name: library library_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.library
    ADD CONSTRAINT library_pk PRIMARY KEY (id);


--
-- TOC entry 3041 (class 2606 OID 16420)
-- Name: librarycatalog librarycatalog_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.librarycatalog
    ADD CONSTRAINT librarycatalog_pk PRIMARY KEY (library_id, book_id);


--
-- TOC entry 3044 (class 2606 OID 16431)
-- Name: libraryuser libraryuser_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.libraryuser
    ADD CONSTRAINT libraryuser_pk PRIMARY KEY (id);


--
-- TOC entry 3042 (class 1259 OID 16432)
-- Name: libraryuser_idx; Type: INDEX; Schema: public; Owner: postgres
--

CREATE UNIQUE INDEX libraryuser_idx ON public.libraryuser USING btree (useremail);


--
-- TOC entry 3049 (class 2606 OID 16444)
-- Name: bookreservation book_bookreservation_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.bookreservation
    ADD CONSTRAINT book_bookreservation_fk FOREIGN KEY (book_id) REFERENCES public.book(id);


--
-- TOC entry 3047 (class 2606 OID 16449)
-- Name: librarycatalog book_librarycatalog_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.librarycatalog
    ADD CONSTRAINT book_librarycatalog_fk FOREIGN KEY (book_id) REFERENCES public.book(id);


--
-- TOC entry 3050 (class 2606 OID 16454)
-- Name: bookreservation library_bookreservation_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.bookreservation
    ADD CONSTRAINT library_bookreservation_fk FOREIGN KEY (library_id) REFERENCES public.library(id);


--
-- TOC entry 3048 (class 2606 OID 16459)
-- Name: librarycatalog library_librarycatalog_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.librarycatalog
    ADD CONSTRAINT library_librarycatalog_fk FOREIGN KEY (library_id) REFERENCES public.library(id);


--
-- TOC entry 3051 (class 2606 OID 16464)
-- Name: bookreservation user_bookreservation_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.bookreservation
    ADD CONSTRAINT user_bookreservation_fk FOREIGN KEY (user_id) REFERENCES public.libraryuser(id);


-- Completed on 2020-07-03 10:48:08 CEST

--
-- PostgreSQL database dump complete
--

