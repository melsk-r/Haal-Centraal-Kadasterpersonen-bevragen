/* 
 * Kadaster - BRK-Kadasterpersonen-Bevragen API
 *
 * Deze API verstrekt informatie over bij het kadaster registreerde personen die (als het goed is) niet zijn geregistreerd in het Handelsregister of de Basisregistratie Personen (inclusief de Registratie Niet Ingezetenen). Het gaat meestal over personen die in het buitenland verblijven of organisaties die in het buitenland gevestigd zijn, en een zakelijk recht hebben op een kadastraal onroerende zaak. Personen in de basisregistratie kadaster worden niet geactualiseerd. De API verstrekt gegevens van personen op het moment van vestiging van het zakelijk recht.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System.Collections.Generic;

namespace Org.OpenAPITools.Client
{
    /// <summary>
    /// <see cref="GlobalConfiguration"/> provides a compile-time extension point for globally configuring
    /// API Clients.
    /// </summary>
    /// <remarks>
    /// A customized implementation via partial class may reside in another file and may
    /// be excluded from automatic generation via a .openapi-generator-ignore file.
    /// </remarks>
    public partial class GlobalConfiguration : Configuration
    {
        #region Private Members

        private static readonly object GlobalConfigSync = new { };
        private static IReadableConfiguration _globalConfiguration;

        #endregion Private Members

        #region Constructors

        /// <inheritdoc />
        private GlobalConfiguration()
        {
        }

        /// <inheritdoc />
        public GlobalConfiguration(IDictionary<string, string> defaultHeader, IDictionary<string, string> apiKey, IDictionary<string, string> apiKeyPrefix, string basePath = "http://localhost:3000/api") : base(defaultHeader, apiKey, apiKeyPrefix, basePath)
        {
        }

        static GlobalConfiguration()
        {
            Instance = new GlobalConfiguration();
        }

        #endregion Constructors

        /// <summary>
        /// Gets or sets the default Configuration.
        /// </summary>
        /// <value>Configuration.</value>
        public static IReadableConfiguration Instance
        {
            get { return _globalConfiguration; }
            set
            {
                lock (GlobalConfigSync)
                {
                    _globalConfiguration = value;
                }
            }
        }
    }
}