class KitStandard {
    constructor() {
        this.equipements = "Kit Radio + Téléphone";
    }
}

class KitFamille extends KitStandard {
    constructor()  {
        super();
        this.equipements = this.equipements + " + Siège Enfant + Miroirs";
    }
}

class KitSport extends KitStandard  {
    constructor() {
        super();
        this.equipements = this.equipements +" + Suspension + Jantes Spécifiques";
    }
}

let VoitureDeBaseProto = new KitStandard();
let VoitureDeSportProto = new KitSport();
let VoitureFamilialleProto = new KitFamille();

let NouvelleVoiture =  Object.create(VoitureDeBaseProto);
console.log(NouvelleVoiture.equipements);

NouvelleVoiture = Object.create(VoitureFamilialleProto);
console.log(NouvelleVoiture.equipements);

NouvelleVoiture = Object.create(VoitureDeSportProto);
console.log(NouvelleVoiture.equipements);

