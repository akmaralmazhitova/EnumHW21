package com.company;

public enum Days {
    ДУЙШОМБУ("Java теория окуйм."),
    ШЕЙШЕМБИ("Англи тилин окуйм."),
    ШАРШЕМБИ("Java теория сабагын окуйм."),
    БЕЙШЕМБИ("Soft Skills сабагын окуйм."),
    ЖУМА("Java теория сабагы болот."),
    ИШЕМБИ("Дем алуу кун."),
    ЖЕКШЕМБИ("Бул куну да эс алам.");

    public String name;

    Days(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  super.toString() + "-->"+ name ;
    }
}
