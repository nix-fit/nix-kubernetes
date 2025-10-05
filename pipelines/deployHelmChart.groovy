@Library('nix-sharedlib@feat/library') _

deployHelmChart(
    chartRepoName: params.chartRepoName,
    chartRepoBranch: params.chartRepoBranch,
    environment: params.environment,
    namespace: params.namespace,
    environmentRepoBranch: params.environmentRepoBranch,
)
