# Changelog

## 1.44.0 (2025-08-02)

Full Changelog: [v1.43.2...v1.44.0](https://github.com/dodopayments/dodopayments-kotlin/compare/v1.43.2...v1.44.0)

### Features

* add retryable exception ([1473a6b](https://github.com/dodopayments/dodopayments-kotlin/commit/1473a6b30c95898c164927d010a97fe82737bc86))
* **api:** updated openapi spec to 1.44.0 ([93b2b19](https://github.com/dodopayments/dodopayments-kotlin/commit/93b2b191f1035aa2ef9b95c16c06ddc406f3f1af))
* **client:** ensure compat with proguard ([7616bb7](https://github.com/dodopayments/dodopayments-kotlin/commit/7616bb78567cce5027c78213a9ad4466283edd5a))


### Bug Fixes

* **client:** r8 support ([ffe200b](https://github.com/dodopayments/dodopayments-kotlin/commit/ffe200b0f950f0c64ab928c5724fbc8025ae9122))


### Chores

* **internal:** bump ci test timeout ([b066aa6](https://github.com/dodopayments/dodopayments-kotlin/commit/b066aa6ce49bc5e97c6a4f054c5492639a9f2782))
* **internal:** reduce proguard ci logging ([5ffa9a1](https://github.com/dodopayments/dodopayments-kotlin/commit/5ffa9a100f17848450ac86be12f6b663dc22eb7c))

## 1.43.2 (2025-07-25)

Full Changelog: [v1.43.1...v1.43.2](https://github.com/dodopayments/dodopayments-kotlin/compare/v1.43.1...v1.43.2)

### Chores

* **internal:** remove unnecessary `[...]` in `[@see](https://github.com/see)` ([783e477](https://github.com/dodopayments/dodopayments-kotlin/commit/783e47745c9e5be52fe2acd880c0fd158c711800))


### Documentation

* more code comments ([beac7b7](https://github.com/dodopayments/dodopayments-kotlin/commit/beac7b7929a2a6aa63f4a6256325a139056192b8))

## 1.43.1 (2025-07-24)

Full Changelog: [v1.43.0...v1.43.1](https://github.com/dodopayments/dodopayments-kotlin/compare/v1.43.0...v1.43.1)

### Documentation

* fix missing readme comment ([97ef98e](https://github.com/dodopayments/dodopayments-kotlin/commit/97ef98ea4977d21f2ecdcc820638eaa0cf88b87e))

## 1.43.0 (2025-07-23)

Full Changelog: [v1.42.0...v1.43.0](https://github.com/dodopayments/dodopayments-kotlin/compare/v1.42.0...v1.43.0)

### Features

* **api:** updated openapi spec to v1.42.5 ([d613975](https://github.com/dodopayments/dodopayments-kotlin/commit/d61397556e2aeb58c4faa2eaa083db09949c0d9a))
* **client:** add `{QueryParams,Headers}#put(String, JsonValue)` methods ([e3b2adb](https://github.com/dodopayments/dodopayments-kotlin/commit/e3b2adb6020f9ed0a1bbb75951a334e35ac460b9))
* **client:** add https config options ([19cf13e](https://github.com/dodopayments/dodopayments-kotlin/commit/19cf13e7e897556321ade784e4592b6604a76a0b))
* **client:** allow configuring env via system properties ([a94a773](https://github.com/dodopayments/dodopayments-kotlin/commit/a94a773e6761967896014f71fe458bc302f81e46))


### Bug Fixes

* **client:** ensure error handling always occurs ([55241c9](https://github.com/dodopayments/dodopayments-kotlin/commit/55241c9209816b3b57248caa7be85436331f7758))


### Chores

* **internal:** allow running specific example from cli ([bb5f3b0](https://github.com/dodopayments/dodopayments-kotlin/commit/bb5f3b05bb48e38bad976d3cdf2edb59d94a6eda))
* **internal:** refactor delegating from client to options ([e500a7f](https://github.com/dodopayments/dodopayments-kotlin/commit/e500a7fb3f0854e17e724c788dfd2267c3beaab9))

## 1.42.0 (2025-07-16)

Full Changelog: [v1.39.0...v1.42.0](https://github.com/dodopayments/dodopayments-kotlin/compare/v1.39.0...v1.42.0)

### Features

* **api:** updated open api spec to v1.42.0 ([be6f535](https://github.com/dodopayments/dodopayments-kotlin/commit/be6f535c9eb700ca5285dccb0e2524f07b52d424))


### Chores

* **ci:** bump `actions/setup-java` to v4 ([6314623](https://github.com/dodopayments/dodopayments-kotlin/commit/631462395ba4240ee8554a5d3d46d61a257fdb58))

## 1.39.0 (2025-07-15)

Full Changelog: [v1.38.1...v1.39.0](https://github.com/dodopayments/dodopayments-kotlin/compare/v1.38.1...v1.39.0)

### Features

* **api:** updated openapi spec to v1.40.0 ([7b0155d](https://github.com/dodopayments/dodopayments-kotlin/commit/7b0155d6c01b34527793595de47c2904398815cb))

## 1.38.1 (2025-07-09)

Full Changelog: [v1.38.0...v1.38.1](https://github.com/dodopayments/dodopayments-kotlin/compare/v1.38.0...v1.38.1)

### Chores

* **ci:** ensure docs generation always succeeds ([ada6cd7](https://github.com/dodopayments/dodopayments-kotlin/commit/ada6cd7e186102a6de643ee11790d74b7519fe39))

## 1.38.0 (2025-07-05)

Full Changelog: [v1.37.1...v1.38.0](https://github.com/dodopayments/dodopayments-kotlin/compare/v1.37.1...v1.38.0)

### Features

* **api:** updated openapi spec to v1.38.0 ([06d5d34](https://github.com/dodopayments/dodopayments-kotlin/commit/06d5d3476b13cc34f51886dbffd57a2017279942))

## 1.37.1 (2025-07-03)

Full Changelog: [v1.37.0...v1.37.1](https://github.com/dodopayments/dodopayments-kotlin/compare/v1.37.0...v1.37.1)

### Features

* **api:** added webhook event type model ([24882eb](https://github.com/dodopayments/dodopayments-kotlin/commit/24882eb4e53a380711621bfa63be5ed8cedf6992))
* **api:** added webhook payload model ([e94cc27](https://github.com/dodopayments/dodopayments-kotlin/commit/e94cc27b4b346fd84fddbee61db4814fe0886bda))

## 1.37.0 (2025-07-02)

Full Changelog: [v1.34.2...v1.37.0](https://github.com/dodopayments/dodopayments-kotlin/compare/v1.34.2...v1.37.0)

### Features

* **api:** updated openapi spec for v1.37.0 ([1a8daae](https://github.com/dodopayments/dodopayments-kotlin/commit/1a8daae4c3035dafd90ff62d3213cd013f6c36f5))


### Bug Fixes

* **ci:** release-doctor — report correct token name ([9e245db](https://github.com/dodopayments/dodopayments-kotlin/commit/9e245dbfe2c52c4fde0de76944861968345e88c5))
* **client:** don't close client on `withOptions` usage when original is gc'd ([98cf334](https://github.com/dodopayments/dodopayments-kotlin/commit/98cf334e094affde215efcf28fdbb0f984bcad8e))


### Chores

* **ci:** only run for pushes and fork pull requests ([667ed24](https://github.com/dodopayments/dodopayments-kotlin/commit/667ed24af962ff14ec5839965cfef8c298c04389))


### Refactors

* **internal:** minor `ClientOptionsTest` change ([629c064](https://github.com/dodopayments/dodopayments-kotlin/commit/629c0642587149a7ea6a7b8ca06bfd5044490157))

## 1.34.2 (2025-06-24)

Full Changelog: [v1.34.1...v1.34.2](https://github.com/dodopayments/dodopayments-kotlin/compare/v1.34.1...v1.34.2)

### Bug Fixes

* **client:** bump max requests per host to max requests (5 -&gt; 64) ([0be8736](https://github.com/dodopayments/dodopayments-kotlin/commit/0be8736200d60c8835ae851d8b96416607270037))

## 1.34.1 (2025-06-21)

Full Changelog: [v1.34.0...v1.34.1](https://github.com/dodopayments/dodopayments-kotlin/compare/v1.34.0...v1.34.1)

## 1.34.0 (2025-06-18)

Full Changelog: [v1.32.0...v1.34.0](https://github.com/dodopayments/dodopayments-kotlin/compare/v1.32.0...v1.34.0)

### Features

* **api:** updated to version 1.34.0 ([9140797](https://github.com/dodopayments/dodopayments-kotlin/commit/9140797a8ea728e0d512e27b957146cd45218f37))
* **client:** add a `withOptions` method ([7e00244](https://github.com/dodopayments/dodopayments-kotlin/commit/7e0024420948ba46db4744d6b361c6a7e4ef65b7))
* **client:** implement per-endpoint base URL support ([ccbef01](https://github.com/dodopayments/dodopayments-kotlin/commit/ccbef01a45d2a343814b188c7c3cae02a9b953ee))


### Chores

* **ci:** enable for pull requests ([2f76f88](https://github.com/dodopayments/dodopayments-kotlin/commit/2f76f88045ba7daa1fb9cd715227495360417de6))

## 1.32.0 (2025-06-09)

Full Changelog: [v1.30.2...v1.32.0](https://github.com/dodopayments/dodopayments-kotlin/compare/v1.30.2...v1.32.0)

### Features

* **api:** updated openapi spec to v1.32.0 ([702478f](https://github.com/dodopayments/dodopayments-kotlin/commit/702478f3ec4b25ed236522d9e604c5c70bc4a5dd))

## 1.30.2 (2025-06-04)

Full Changelog: [v1.30.0...v1.30.2](https://github.com/dodopayments/dodopayments-kotlin/compare/v1.30.0...v1.30.2)

### Features

* **api:** fixed openapi spec ([2b65dde](https://github.com/dodopayments/dodopayments-kotlin/commit/2b65ddea67f4525cbdc43aa4cc905f9fe0785df4))

## 1.30.0 (2025-06-02)

Full Changelog: [v1.27.0...v1.30.0](https://github.com/dodopayments/dodopayments-kotlin/compare/v1.27.0...v1.30.0)

### Features

* **api:** manual updates ([e931406](https://github.com/dodopayments/dodopayments-kotlin/commit/e931406d0c36b5846e4147e938c0049ea46cb79b))


### Chores

* configure new SDK language ([e4e3e0b](https://github.com/dodopayments/dodopayments-kotlin/commit/e4e3e0bfd5f3539b585b075602ef92d6b05da77b))

## 1.27.0 (2025-05-26)

Full Changelog: [v1.25.0...v1.27.0](https://github.com/dodopayments/dodopayments-kotlin/compare/v1.25.0...v1.27.0)

### Features

* **api:** updated openapi spec to 1.27.0 ([4d46d06](https://github.com/dodopayments/dodopayments-kotlin/commit/4d46d06f538aabdac4fed1ff43b4c366d92e9dce))


### Chores

* **internal:** codegen related update ([e3be475](https://github.com/dodopayments/dodopayments-kotlin/commit/e3be4752da60bafe620c5c84125e74efe88ceaa1))

## 1.25.0 (2025-05-17)

Full Changelog: [v1.22.0...v1.25.0](https://github.com/dodopayments/dodopayments-kotlin/compare/v1.22.0...v1.25.0)

### ⚠ BREAKING CHANGES

* **client:** change precision of some numeric types
* **client:** extract auto pagination to shared classes
* **client:** **Migration:** - If you were referencing the `AutoPager` class on a specific `*Page` or `*PageAsync` type, then you should instead reference the shared `AutoPager` and `AutoPagerAsync` types, under the `core` package
    - If you were referencing `getNextPage` or `getNextPageParams`:
       - Swap to `nextPage()` and `nextPageParams()`
       - Note that these both now return non-nullable types (use `hasNextPage()` before calling these, since they will throw if it's impossible to get another page)

### Features

* **api:** updated openapi spec ([dd15274](https://github.com/dodopayments/dodopayments-kotlin/commit/dd15274b7ca00e2ef10170cb6c78363e3365f770))
* **client:** extract auto pagination to shared classes ([7d2edc9](https://github.com/dodopayments/dodopayments-kotlin/commit/7d2edc95ef3df102d75d6444448f62b1e2df3d9c))


### Chores

* **internal:** codegen related update ([b4aa216](https://github.com/dodopayments/dodopayments-kotlin/commit/b4aa216037c32b481c63064deafade58caab5cb9))
* **internal:** version bump ([c8cb33f](https://github.com/dodopayments/dodopayments-kotlin/commit/c8cb33f6484a6695f39068764f005d71b8d4a9d5))


### Documentation

* remove or fix invalid readme examples ([dcd598c](https://github.com/dodopayments/dodopayments-kotlin/commit/dcd598c4708e098d81b282d2426546dee3c7db65))


### Refactors

* **client:** change precision of some numeric types ([e0e83b9](https://github.com/dodopayments/dodopayments-kotlin/commit/e0e83b97ec2996b9dfbb004e002732ea3ce3da53))

## 1.22.0 (2025-05-09)

Full Changelog: [v1.21.0...v1.22.0](https://github.com/dodopayments/dodopayments-kotlin/compare/v1.21.0...v1.22.0)

### Features

* **client:** allow providing some params positionally ([51abdcb](https://github.com/dodopayments/dodopayments-kotlin/commit/51abdcb9c2352f5d7e198d2cc5007668c8bf0d8e))

## 1.21.0 (2025-05-09)

Full Changelog: [v1.20.0...v1.21.0](https://github.com/dodopayments/dodopayments-kotlin/compare/v1.20.0...v1.21.0)

### Features

* **api:** fixed api key schema to bearer ([af546dc](https://github.com/dodopayments/dodopayments-kotlin/commit/af546dc5d448b461a5ef4f49296eea3413f5484e))
* **api:** manual updates ([9aace49](https://github.com/dodopayments/dodopayments-kotlin/commit/9aace49503c80d636c9b595d3ebd13b2236ce9a6))
* **api:** updated openapi spec ([5b3572b](https://github.com/dodopayments/dodopayments-kotlin/commit/5b3572ba40c3404aaf15a43d013d6967d56c784b))


### Chores

* **internal:** codegen related update ([4ce7671](https://github.com/dodopayments/dodopayments-kotlin/commit/4ce76716c831795b0e2ab594af518aa5a3bc3f1d))
* **internal:** remove flaky `-Xbackend-threads=0` option ([3e0d295](https://github.com/dodopayments/dodopayments-kotlin/commit/3e0d295a9a30bada33d14d15e5a6b618073f65de))
* **internal:** update java toolchain ([401440b](https://github.com/dodopayments/dodopayments-kotlin/commit/401440bee3d86437ae9043d2b7280d7197bbf6ad))

## 1.20.0 (2025-05-01)

Full Changelog: [v1.19.0...v1.20.0](https://github.com/dodopayments/dodopayments-kotlin/compare/v1.19.0...v1.20.0)

### Features

* **api:** added addons ([58c4b1c](https://github.com/dodopayments/dodopayments-kotlin/commit/58c4b1c08ce5e7173a32db20e09f1e16c589b3c4))
* **api:** updated readme example ([5ea0c1c](https://github.com/dodopayments/dodopayments-kotlin/commit/5ea0c1c5783b59cb265672d17dafec652ca8d0f6))
* **api:** updated readme example ([35cfcc2](https://github.com/dodopayments/dodopayments-kotlin/commit/35cfcc2f69d856f2fc98ab8c5864b6e674b0e28e))

## 1.19.0 (2025-04-30)

Full Changelog: [v1.18.3...v1.19.0](https://github.com/dodopayments/dodopayments-kotlin/compare/v1.18.3...v1.19.0)

### Features

* **api:** manual updates ([3759e90](https://github.com/dodopayments/dodopayments-kotlin/commit/3759e9030e535c15737f2bd8daf1a05c55477f71))

## 1.18.3 (2025-04-25)

Full Changelog: [v1.18.1...v1.18.3](https://github.com/dodopayments/dodopayments-kotlin/compare/v1.18.1...v1.18.3)

### Features

* **api:** manual updates ([2651a08](https://github.com/dodopayments/dodopayments-kotlin/commit/2651a08d2c3bca3617e8a5eb8ee97908ef3370fc))

## 1.18.1 (2025-04-24)

Full Changelog: [v1.18.0...v1.18.1](https://github.com/dodopayments/dodopayments-kotlin/compare/v1.18.0...v1.18.1)

### Chores

* **ci:** only use depot for staging repos ([a5192c9](https://github.com/dodopayments/dodopayments-kotlin/commit/a5192c9caa661a525119660c6dddaca3ce5cf946))
* **internal:** codegen related update ([7b74fdf](https://github.com/dodopayments/dodopayments-kotlin/commit/7b74fdfb46225a39df70cc806219c2f233f950b5))
* **internal:** java 17 -&gt; 21 on ci ([a32c7ae](https://github.com/dodopayments/dodopayments-kotlin/commit/a32c7aedd1947f2cf82de67b4efe5718f779ab15))

## 1.18.0 (2025-04-23)

Full Changelog: [v1.17.0...v1.18.0](https://github.com/dodopayments/dodopayments-kotlin/compare/v1.17.0...v1.18.0)

### Features

* **api:** added change plan api ([8f5e0f4](https://github.com/dodopayments/dodopayments-kotlin/commit/8f5e0f44fac12f492c69a99e0f7cf52b29b986df))
* **api:** manual updates ([8c6a744](https://github.com/dodopayments/dodopayments-kotlin/commit/8c6a7441400a69a77539e1bb8c6fd44339e1d9c0))


### Chores

* **ci:** add timeout thresholds for CI jobs ([77fceb7](https://github.com/dodopayments/dodopayments-kotlin/commit/77fceb7b264e760587e1fdcc55e1cef7873008ba))

## 1.17.0 (2025-04-22)

Full Changelog: [v1.16.1...v1.17.0](https://github.com/dodopayments/dodopayments-kotlin/compare/v1.16.1...v1.17.0)

### Features

* **api:** manual updates ([ee9f33b](https://github.com/dodopayments/dodopayments-kotlin/commit/ee9f33ba3c3f3a511126a54c802234055243551c))

## 1.16.1 (2025-04-18)

Full Changelog: [v1.14.2...v1.16.1](https://github.com/dodopayments/dodopayments-kotlin/compare/v1.14.2...v1.16.1)

### Features

* **api:** manual updates ([6a0b53f](https://github.com/dodopayments/dodopayments-kotlin/commit/6a0b53fd458a8a89b71665a756744a8cb4e89be5))


### Chores

* **internal:** codegen related update ([6f42fa7](https://github.com/dodopayments/dodopayments-kotlin/commit/6f42fa7dd590f4e7f90db9c687677f482873f140))
* **internal:** version bump ([199c3d5](https://github.com/dodopayments/dodopayments-kotlin/commit/199c3d50c9d07757ee4859d58367d62f99f46f0b))

## 1.14.2 (2025-04-17)

Full Changelog: [v1.14.1...v1.14.2](https://github.com/dodopayments/dodopayments-kotlin/compare/v1.14.1...v1.14.2)

### Chores

* **internal:** version bump ([c634026](https://github.com/dodopayments/dodopayments-kotlin/commit/c634026cb5354dcd2e9deeb97862603963a40338))

## 1.14.1 (2025-04-17)

Full Changelog: [v1.14.0...v1.14.1](https://github.com/dodopayments/dodopayments-kotlin/compare/v1.14.0...v1.14.1)

### Chores

* **internal:** version bump ([f55e019](https://github.com/dodopayments/dodopayments-kotlin/commit/f55e0190aa63523b6d92ac50728a20c7f34ed07f))

## 1.14.0 (2025-04-17)

Full Changelog: [v0.0.1-alpha.0...v1.14.0](https://github.com/dodopayments/dodopayments-kotlin/compare/v0.0.1-alpha.0...v1.14.0)

### Features

* **api:** added publishing for ruby, java and kotlin ([ba0a469](https://github.com/dodopayments/dodopayments-kotlin/commit/ba0a469836a1579eec7a4ffdf60bdc8599902f1c))
* **api:** fixed openapi spec issues ([8883f26](https://github.com/dodopayments/dodopayments-kotlin/commit/8883f2639122e0605690f8af070d49fd0fec8da6))
* **api:** manual updates ([e5c8d91](https://github.com/dodopayments/dodopayments-kotlin/commit/e5c8d91127ee9c361b1219c2767c242e55e587ac))
* **api:** openapi spec updated ([942f449](https://github.com/dodopayments/dodopayments-kotlin/commit/942f4493b919e397cf173517dad1e5d8a9428af6))
* **api:** updated stainless config ([6395277](https://github.com/dodopayments/dodopayments-kotlin/commit/6395277a21d79255ffba3a804e13897c8c74ac10))


### Chores

* configure new SDK language ([fd4b756](https://github.com/dodopayments/dodopayments-kotlin/commit/fd4b75697072518fd1101e48c2253e4656f87e57))
* update SDK settings ([1de2a10](https://github.com/dodopayments/dodopayments-kotlin/commit/1de2a105cb47fadac8e9bb194826ba00d5eb836d))
* update SDK settings ([1c72654](https://github.com/dodopayments/dodopayments-kotlin/commit/1c726548d7f6a42372b3643170f987febf2d4620))
