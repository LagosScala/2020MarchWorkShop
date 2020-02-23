
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization    := "lagoscala.com",
      scalaVersion    := "2.12.9"
    )),
    name := "workshop-exercise",
    libraryDependencies ++= Seq(
      "org.scalatest"     %% "scalatest"            % "3.0.1"         % Test,
      
    )
  )

