rootProject.name = "bbangca-javacraft"

pluginManagement {
	includeBuild("build-conventions")
}

val rootFolders = listOf("core", "framework")

rootFolders.forEach { folderName ->
	val targetDir = File(rootDir, folderName)
	if (targetDir.exists()) {
		println("🔍 Scanning modules under '$folderName/' ...")

		targetDir.walkTopDown()
			.filter { file ->
				file.isDirectory && File(file, "build.gradle.kts").exists()
			}
			.forEach { dir ->
				val relativePath = dir.relativeTo(rootDir).invariantSeparatorsPath
				val modulePath = relativePath.replace("/", ":")
				include(modulePath)
				println("✅ Included module: $modulePath")
			}
	} else {
		println("⚠️ Directory '$folderName' not found, skipping.")
	}
}