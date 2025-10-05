@Library('nix-sharedlib@feat/library') _

deployHelmChart(
    chartRepoName: params.chartRepoName,
    environment: params.environment,
    namespace: params.namespace,
    environmentRepoBranch: params.environmentRepoBranch,
)
