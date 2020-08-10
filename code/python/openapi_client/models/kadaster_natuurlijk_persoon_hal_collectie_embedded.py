# coding: utf-8

"""
    Kadaster - BRK-Kadasterpersonen-Bevragen API

    Deze API verstrekt informatie over bij het kadaster registreerde personen die (als het goed is) niet zijn geregistreerd in het Handelsregister of de Basisregistratie Personen (inclusief de Registratie Niet Ingezetenen). Het gaat meestal over personen die in het buitenland verblijven of organisaties die in het buitenland gevestigd zijn, en een zakelijk recht hebben op een kadastraal onroerende zaak. Personen in de basisregistratie kadaster worden niet geactualiseerd. De API verstrekt gegevens van personen op het moment van vestiging van het zakelijk recht.  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from openapi_client.configuration import Configuration


class KadasterNatuurlijkPersoonHalCollectieEmbedded(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'kadaster_natuurlijk_personen': 'list[KadasterNatuurlijkPersoonHal]'
    }

    attribute_map = {
        'kadaster_natuurlijk_personen': 'kadasterNatuurlijkPersonen'
    }

    def __init__(self, kadaster_natuurlijk_personen=None, local_vars_configuration=None):  # noqa: E501
        """KadasterNatuurlijkPersoonHalCollectieEmbedded - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._kadaster_natuurlijk_personen = None
        self.discriminator = None

        if kadaster_natuurlijk_personen is not None:
            self.kadaster_natuurlijk_personen = kadaster_natuurlijk_personen

    @property
    def kadaster_natuurlijk_personen(self):
        """Gets the kadaster_natuurlijk_personen of this KadasterNatuurlijkPersoonHalCollectieEmbedded.  # noqa: E501


        :return: The kadaster_natuurlijk_personen of this KadasterNatuurlijkPersoonHalCollectieEmbedded.  # noqa: E501
        :rtype: list[KadasterNatuurlijkPersoonHal]
        """
        return self._kadaster_natuurlijk_personen

    @kadaster_natuurlijk_personen.setter
    def kadaster_natuurlijk_personen(self, kadaster_natuurlijk_personen):
        """Sets the kadaster_natuurlijk_personen of this KadasterNatuurlijkPersoonHalCollectieEmbedded.


        :param kadaster_natuurlijk_personen: The kadaster_natuurlijk_personen of this KadasterNatuurlijkPersoonHalCollectieEmbedded.  # noqa: E501
        :type: list[KadasterNatuurlijkPersoonHal]
        """

        self._kadaster_natuurlijk_personen = kadaster_natuurlijk_personen

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, KadasterNatuurlijkPersoonHalCollectieEmbedded):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, KadasterNatuurlijkPersoonHalCollectieEmbedded):
            return True

        return self.to_dict() != other.to_dict()
