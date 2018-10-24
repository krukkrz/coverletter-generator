public class Creator {
    public String coverLetter (String companyName, String positionName, String klauzula){
        String text;

        text = "Szanowni Państwo,\n" +
                "Tym listem pragnę wyrazić swoją chęć dołączenia do zespołu "+companyName+" na pozycji "+positionName+". \n"+"Obecnie pracuję na stanowisku Strudent Assistant w dziale Strategii Produktu firmy Vestas Wind Systems A/S – globalnym liderze produkcji turbin wiatrowych. Jednym z moich głównych zadań jest budowa bazy danych Kodeksów Sieciowych (Grid Codes) gdzie biorę czynny udział w projektowaniu jej funkcjonalności.\n" +
                "Moim poprzednim stanowiskiem był Junior Buyer w firmie General Electric. Do moich obowiązków należało utrzymywanie kontaktu z dostawcami, kontrola zapasów w magazynach na terenie Europy oraz inicjowanie zleceń transportu i pilnowanie ich punktualności. Moje zadania wykonywałem głównie korzystając z programów SAP oraz Excel.\n" +
                "Obecnie studiuję na kierunku Entrepreneurial Engineering stopnia magisterskiego na Aalborg University w Danii. Ten program nauczania skupia się na tematyce przedsiębiorczości korporacyjnej i modelów biznesowych. Podczas zajęć korzystam z narzędzi takich jak design thinking, Business oraz Value Model Canvas, Blue Ocean Strategy i Gantt Charts.\n" +
                "Uzyskałem stopień inżyniera na kierunku Energetyka na Politechnice Łódzkiej. Podczas zajęć uczyłem się o zagadnieniach z zakresu termodynamiki, elektrotechniki, mechaniki i automatyki a także o rynkach mocy, rozwiązaniach OZE i magazynowaniu energii. Nabyłem wówczas umiejętności korzystania z programów takich jak PTC Creo i AutoCAD.\n" +
                "Prywatnie zajmuję się tworzeniem stron internetowych i programowaniem. Moim projektem, który mogą państwo znaleźć pod adresem http://dca.ct8.pl/index.html jest strona poświęcona tematyce budowy dronów, którą sukcesywnie wypełniam informacjami. W tym projekcie poświęciłem najwięcej uwagi CSS, JavaScript oraz Bootstrap 4 tak aby zaprojektować stronę o prostym jednak estetycznym designie.\n" +
                "Moim drugim projektem jest aplikacja webowa napisana w języku JAVA dostępna pod adresem http://sent.us-east-2.elasticbeanstalk.com. Jest to aplikacja analizująca czy zdanie podane przez użytkownika jest pozytywne, negatywne bądź neutralne. Do jej budowy użyłem technologii JSP oraz XML.\n" +
                "Stale rozwijam swoje umiejętności programistyczne i obecnie pracuję nad aplikacją webową dającą dostęp do bazy danych rezerwacji hostelu KDKRUK – pokoje gościnne w Łodzi. Do jej budowy używam języka JAVA a także technologii Spring Boot, MySQL oraz Angular.\n" +
                "Pragnę dalej rozwijać się w kierunku programowania. Jestem pewien że mogę przyspieszyć postępy nauki dzięki pracy dla "+companyName+" z korzyścią dla obu stron.\n" +
                "Obecnie mieszkam w Aarhus w Danii. Przed sobą mam ostatni rok studiów, a elastyczny model zajęć oraz wsparcie prowadzących w zdobywaniu praktycznego doświadczenia umożliwia mi zaliczenie tego roku zdalnie. Z tego powodu oraz w wyniku zaplanowanego powrotu do Polski zdecydowałem się zaaplikować na to stanowisko już teraz. Bardzo dziękuję za czas poświęcony mojej aplikacji. \n"+"\n"+
                "Z poważaniem,\n" +
                "Krzysztof Kruk\n \n \n"+klauzula;

        return text;
    }
}
