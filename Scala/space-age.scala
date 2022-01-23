object SpaceAge{
    var EARTH_YEAR = 31557600
    
    def onEarth(seconds: Double): Double = BigDecimal(seconds / EARTH_YEAR).
                                          setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    def onMercury(seconds: Double): Double = BigDecimal(seconds / EARTH_YEAR / 0.2408467).
                                            setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    def onVenus(seconds: Double): Double = BigDecimal(seconds / EARTH_YEAR / 0.61519726).
                                          setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    def onMars(seconds: Double): Double = BigDecimal(seconds / EARTH_YEAR / 1.8808158).
                                          setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    def onJupiter(seconds: Double): Double = BigDecimal(seconds / EARTH_YEAR / 11.862615).
                                            setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    def onSaturn(seconds: Double): Double = BigDecimal(seconds / EARTH_YEAR / 29.447498).
                                            setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    def onUranus(seconds: Double): Double = BigDecimal(seconds / EARTH_YEAR / 84.016846).
                                            setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    def onNeptune(seconds: Double): Double = BigDecimal(seconds / EARTH_YEAR / 164.79132).
                                              setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
}