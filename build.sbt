ThisBuild / scalaVersion     := "2.13.6"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

resolvers += "Sonatype OSS Snapshots" at "https://s01.oss.sonatype.org/content/repositories/snapshots"
resolvers += "Moar Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

// TODO - reorganize this into a Dependencies class?
val zioVersion        = "1.0.11"
val zioPreludeVersion = "1.0.0-RC6"
val zioLoggingVersion = "0.5.8"
val zioHttpVersion    = "1.0.0.0-RC17+25-895e6595-SNAPSHOT"
val zioJsonVersion    = "0.2.0-M1"
val zioOpticsVersion  = "0.1.0"
val zioSchemaVersion  = "0.0.5"
val zQueryVersion     = "0.2.9"
val quillVersion      = "3.9.0"
val flywayVersion     = "7.9.1"
val zioConfigVersion  = "1.0.5"
val tapirVersion      = "0.19.0-M7"
val chimneyVersion    = "0.6.1"
val sttpVersion       = "3.3.9"
val zmxVersion        = "0.0.7"
val zioMagicVersion   = "0.3.8"

libraryDependencies ++= Seq(
  "dev.zio"                       %% "zio"                      % zioVersion,
  "dev.zio"                       %% "zio-macros"               % zioVersion,
  "dev.zio"                       %% "zio-prelude"              % zioPreludeVersion,
  "dev.zio"                       %% "zio-json"                 % zioJsonVersion,
  "dev.zio"                       %% "zio-logging-slf4j"        % zioLoggingVersion,
  "dev.zio"                       %% "zio-config"               % zioConfigVersion,
  "dev.zio"                       %% "zio-config-magnolia"      % zioConfigVersion,
  "dev.zio"                       %% "zio-config-typesafe"      % zioConfigVersion,
//  "dev.zio"                       %% "zio-query"                % zQueryVersion,
//  "dev.zio"                       %% "zio-schema"               % zioSchemaVersion,
  "dev.zio"                       %% "zio-zmx"                  % zmxVersion,
  "io.github.kitlangton"          %% "zio-magic"                % zioMagicVersion,
//  "io.d11"                        %% "zhttp"                    % zioHttpVersion,
  "io.getquill"                   %% "quill-jdbc-zio"           % quillVersion,
  "org.flywaydb"                   % "flyway-core"              % flywayVersion,
  "com.softwaremill.sttp.tapir"   %% "tapir-zio"                % tapirVersion,
  "com.softwaremill.sttp.tapir"   %% "tapir-zio-http"           % tapirVersion,
  "com.softwaremill.sttp.tapir"   %% "tapir-json-zio"           % tapirVersion,
  "com.softwaremill.sttp.tapir"   %% "tapir-redoc"              % tapirVersion,
  "com.softwaremill.sttp.tapir"   %% "tapir-openapi-docs"       % tapirVersion,
  "com.softwaremill.sttp.tapir"   %% "tapir-openapi-circe-yaml" % tapirVersion,
  "io.scalaland"                  %% "chimney"                  % chimneyVersion,
  "com.softwaremill.sttp.client3" %% "httpclient-backend-zio"   % sttpVersion,
  "com.github.jwt-scala"          %% "jwt-core"                 % "8.0.2",
  "org.postgresql"                 % "postgresql"               % "42.2.8",
  "ch.qos.logback"                 % "logback-classic"          % "1.2.3",
  "net.logstash.logback"           % "logstash-logback-encoder" % "6.5",
  "dev.zio"                       %% "zio-test"                 % zioVersion % Test,
  "dev.zio"                       %% "zio-test-sbt"             % zioVersion % Test,
  "dev.zio"                       %% "zio-test-magnolia"        % zioVersion % Test
)

lazy val root = (project in file("."))
  .settings(
    name := "inventory-service",
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  )
