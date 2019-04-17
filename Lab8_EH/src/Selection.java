public class Selection {

    public static Livre[] Selection(Livre[] livres){

        for (int i = 0; i < livres.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < livres.length; j++)
                if (livres[j].AnneeProd < livres[index].AnneeProd)
                    index = j;

            Livre smallerNumber = livres[index];
            livres[index] = livres[i];
            livres[i] = smallerNumber;
        }
        return livres;
    }
}
