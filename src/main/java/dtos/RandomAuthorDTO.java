package dtos;

public class RandomAuthorDTO
{

    private String name;
    private String nationality;
    private String profession;
    private String born ;
    private String died;

    public RandomAuthorDTO(String name, String nationality, String profession, String born, String died)
    {
        this.name = name;
        this.nationality = nationality;
        this.profession = profession;
        this.born = born;
        this.died = died;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getNationality()
    {
        return nationality;
    }

    public void setNationality(String nationality)
    {
        this.nationality = nationality;
    }

    public String getProfession()
    {
        return profession;
    }

    public void setProfession(String profession)
    {
        this.profession = profession;
    }

    public String getBorn()
    {
        return born;
    }

    public void setBorn(String born)
    {
        this.born = born;
    }

    public String getDied()
    {
        return died;
    }

    public void setDied(String died)
    {
        this.died = died;
    }
}
