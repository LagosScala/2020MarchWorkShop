
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization    := "lagoscala.com",
      scalaVersion    := "2.12.10"
    )),
    name := "workshop-exercise",
    libraryDependencies ++= Seq(
      "org.scalatest"     %% "scalatest"            % "3.1.1"         % Test,
      
    )
  )

  lazy val sharedSettings = Seq(

  version := "0.1.0", 
  organization := "com.lagosscala", 
  scalaVersion := "2.12.10"
)

  lazy val session1 = (project in file ("session1"))
    .settings(sharedSettings,
       libraryDependencies ++= Seq(
         "org.scalatest" %% "scalatest" % "3.1.1" % Test
       ))

  lazy val session2 = (project in file ("session2"))
    .settings(sharedSettings,
       libraryDependencies ++= Seq(
         "org.scalatest" %% "scalatest" % "3.1.1" % Test
       ))

  lazy val session3 = (project in file ("session3"))
    .settings(sharedSettings,
       libraryDependencies ++= Seq(
         "org.scalatest" %% "scalatest" % "3.1.1" % Test
       ))



  lazy val session4 = (project in file ("session4"))
    .settings(sharedSettings,
       libraryDependencies ++= Seq(
         "org.scalatest" %% "scalatest" % "3.1.1" % Test
       ))

