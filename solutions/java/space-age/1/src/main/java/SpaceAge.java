class SpaceAge {
    double ageInYears;
    double ageInSeconds;
    SpaceAge(double seconds) {
        ageInSeconds = seconds;
        ageInYears = seconds / 31557600;
    }

    double getSeconds() {
        return this.ageInSeconds;
    }

    double onEarth() {
        return ageInYears * 1.0;
    }

    double onMercury() {
        return ageInYears / 0.2408467;
    }

    double onVenus() {
        return ageInYears/0.61519726;
    }

    double onMars() {
        return ageInYears/1.8808158;
    }

    double onJupiter() {
               return ageInYears/11.862615;

    }

    double onSaturn() {
               return ageInYears/29.447498;

    }

    double onUranus() {
               return ageInYears/84.016846;

    }

    double onNeptune() {
              return ageInYears/164.79132;
    }

}
